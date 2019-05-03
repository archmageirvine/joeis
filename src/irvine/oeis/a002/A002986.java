package irvine.oeis.a002;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.CliFlags;

/**
 * A002986 Number of non-cyclic hydrocarbons with n carbon atoms <code>(excluding stereoisomers)</code>.
 * @author Sean A. Irvine
 */
public class A002986 implements Sequence {

  // This class iteratively generates A002986 by exhaustively generating the molecules
  // (in the form of trees).  It is not particularly smart using essentially brute
  // force to extend from one iteration to the next.
  //
  // Adds one more carbon atom to each possible position in the set of molecules from
  // the previous iteration.  A canonicalization procedure is used to make
  // sure only one isomorph is retained for each molecule.  Since these molecules
  // are acyclic they can be represented as a tree with a valence of 1, 2, or 3
  // on each edge and the additional constraint that no node has total valence of
  // more than 4.
  //
  // The canonicalization process for a rooted tree consists of defining a particular
  // order for the subtrees of a node.  The canonical molecule for a particular
  // molecule is the "largest" of all possible rooted trees for the molecule.
  //
  // The overall procedure is thus approximately:
  //   for each molecule in the previous iteration
  //     for each possible extension (subject to valency constraints)
  //       for each possible rooting of that extension
  //         compute canonical form of rooted tree
  //       add "largest" canonical form of extension to retained set
  //
  // Note that the computations for each molecule from the previous iteration are
  // independent and thus can be done in parallel.  To reduce synchronization
  // overheads, each thread maintains its own list of unique molecules discovered
  // by the extension process.  Once all extensions are computed the union of the
  // sets from each thread is computed (this step could be made faster).  Note
  // many molecules will occur in multiple subsets.  Thus, memory used is related
  // to the number of threads.  Thus in some circumstances you might be better
  // off using a lower number of threads (use -Doeis.threads=n).
  //
  // Using 6 threads and 350G RAM, a(16)= 28619581 was computed in < 1/2 hour.
  //
  // I believe it would be entirely possible to compute further values,
  // by exporting the sets from each thread (with a suitable toString()) method,
  // then external sorting and merging the results.

  /*
   * Actually this sequence can be computed much quicker using "nauty":
   * n=1
   * while :; do
   *   echo ${n} $(/usr/bin/time -f %E -o time.out geng -c -D4 ${n} $[n-1]:$[n-1] -q | multig -m3 -D4 -u 2>&1 | grep Z | gawk '{print $7}') $(cat time.out)
   *   n=$[n+1]
   * done
   *
   * Thus it would make sense to replace this implementation with one based on
   * "nauty" cf. A134818.
   */

  private static final int CARBON_VALENCY = 4;
  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private static final String OUTPUT_FLAG = "output";
  private static final String NUM_CARBONS_FLAG = "num-carbons";
  private static final String INPUT_FLAG = "input";

  private static final class AcyclicAlkyl implements Comparable<AcyclicAlkyl> {

    private final AcyclicAlkyl[] mChildren = new AcyclicAlkyl[CARBON_VALENCY];
    private final int[] mBondValency = new int[4];
    private int mUsedValency;

    private AcyclicAlkyl(final int used) {
      mUsedValency = used;
    }

    private AcyclicAlkyl copy() {
      final AcyclicAlkyl copy = new AcyclicAlkyl(mUsedValency);
      System.arraycopy(mBondValency, 0, copy.mBondValency, 0, mBondValency.length);
      for (int k = 0; k < mChildren.length && mChildren[k] != null; ++k) {
        copy.mChildren[k] = mChildren[k].copy();
      }
      return copy;
    }

    @Override
    public int hashCode() {
      int h = mUsedValency;
      int k = 0;
      for (final AcyclicAlkyl t : mChildren) {
        if (t != null) {
          h += (mBondValency[k] + ++k) * t.hashCode();
        }
      }
      return h;
    }

    @Override
    public int compareTo(final AcyclicAlkyl t) {
      final int v = Integer.compare(t.mUsedValency, mUsedValency);
      if (v != 0) {
        return v;
      }
      for (int k = 0; k < mBondValency.length; ++k) {
        final int cc = Integer.compare(t.mBondValency[k], mBondValency[k]);
        if (cc != 0) {
          return cc;
        }
      }
      for (int k = 0; k < mChildren.length && mBondValency[k] != 0; ++k) {
        final int subtreeCompare = mChildren[k].compareTo(t.mChildren[k]);
        if (subtreeCompare != 0) {
          return subtreeCompare;
        }
      }
      return 0;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof AcyclicAlkyl && compareTo((AcyclicAlkyl) obj) == 0;
    }

    private void swap(final int a, final int b) {
      final AcyclicAlkyl t = mChildren[a];
      mChildren[a] = mChildren[b];
      mChildren[b] = t;
      final int c = mBondValency[a];
      mBondValency[a] = mBondValency[b];
      mBondValency[b] = c;
    }

    /**
     * Given a path from the current root to a node in the tree, rotate the
     * tree so that the last node in the path becomes the root of the tree.
     * The returned tree is a copy, the original is not modified.
     * @param path path to desired node
     */
    private AcyclicAlkyl makeRoot(final ArrayList<AcyclicAlkyl> path) {
      AcyclicAlkyl prev = path.get(path.size() - 1);
      final AcyclicAlkyl root = new AcyclicAlkyl(0);
      AcyclicAlkyl newPrev = root;
      for (int k = 0; k < prev.mChildren.length && prev.mChildren[k] != null; ++k) {
        root.mChildren[k] = prev.mChildren[k]; // .copy() - this part should be immutable hence copy not needed
        root.mBondValency[k] = prev.mBondValency[k];
        root.mUsedValency += prev.mBondValency[k];
      }

      for (int k = path.size() - 2; k >= 0; --k) {
        final AcyclicAlkyl pk = path.get(k);
        // Update link from prev
        int j = 0;
        while (newPrev.mChildren[j] != null) {
          ++j;
        }
        int i = 0;
        while (pk.mChildren[i] != prev) {
          ++i;
        }
        final int oldValence = pk.mBondValency[i];
        final AcyclicAlkyl newPk = new AcyclicAlkyl(oldValence);
        newPrev.mChildren[j] = newPk;
        newPrev.mBondValency[j] = oldValence;
        newPrev.mUsedValency += oldValence;
        // Copy across the children of pk that are not on the path
        for (int ii = 0, jj = 0; ii < pk.mChildren.length && pk.mChildren[ii] != null; ++ii) {
          if (pk.mChildren[ii] != prev) {
            newPk.mChildren[jj] = pk.mChildren[ii]; // .copy() - this part should be immutable hence copy not needed
            newPk.mBondValency[jj++] = pk.mBondValency[ii];
            newPk.mUsedValency += pk.mBondValency[ii];
          }
        }
        // Stepping to next node
        prev = pk;
        newPrev = newPk;
      }
      return root;
    }

    /**
     * Compute the canonical form of a given (rooted) tree.  This is done by recursively
     * computing the canonical form of each subtree of the root, then sorting the
     * order of the subtrees.
     */
    private void rootedTreeCanonicalize() {
      for (final AcyclicAlkyl c : mChildren) {
        if (c != null) {
          c.rootedTreeCanonicalize();
        }
      }
      if (mChildren[0] == null || mChildren[1] == null) {
        // 1 or 0 subtrees, no sorting required
        return;
      }
      if (mChildren[2] == null) {
        // Sort 2 subtrees
        final int cc = mChildren[0].compareTo(mChildren[1]);
        if (cc > 0) {
          swap(0, 1);
        }
        return;
      }
      if (mChildren[3] == null) {
        // Sort 3 subtrees
        int c = mChildren[0].compareTo(mChildren[1]);
        if (c > 0) {
          swap(0, 1);
        }
        c = mChildren[1].compareTo(mChildren[2]);
        if (c > 0) {
          swap(1, 2);
        }
        c = mChildren[0].compareTo(mChildren[1]);
        if (c > 0) {
          swap(0, 1);
        }
        return;
      }
      // Sort 4 subtrees
      int c = mChildren[0].compareTo(mChildren[1]);
      if (c > 0) {
        swap(0, 1);
      }
      c = mChildren[2].compareTo(mChildren[3]);
      if (c > 0) {
        swap(2, 3);
      }
      c = mChildren[1].compareTo(mChildren[3]);
      if (c > 0) {
        swap(1, 3);
      }
      c = mChildren[0].compareTo(mChildren[2]);
      if (c > 0) {
        swap(0, 2);
      }
      c = mChildren[1].compareTo(mChildren[2]);
      if (c > 0) {
        swap(1, 2);
      }
    }

    private AcyclicAlkyl best(AcyclicAlkyl best, final ArrayList<AcyclicAlkyl> path) {
      final AcyclicAlkyl candidate = makeRoot(path);
      candidate.rootedTreeCanonicalize();
      final int cc = best.compareTo(candidate);
      if (cc > 0) {
        best = candidate;
      }
      final AcyclicAlkyl n = path.get(path.size() - 1);
      for (int k = 0; k < n.mChildren.length && n.mChildren[k] != null; ++k) {
        path.add(n.mChildren[k]);
        best = best(best, path);
        path.remove(path.size() - 1);
      }
      return best;
    }

    /**
     * Find the canonical form of an unrooted tree.  This is done by computing a canonical
     * form for each possible rooted tree and choosing the "largest".
     * @return canonical form of tree
     */
    private AcyclicAlkyl canoncalize() {
      rootedTreeCanonicalize();
      final ArrayList<AcyclicAlkyl> path = new ArrayList<>();
      path.add(this);
      return best(this, path);
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append('C');
      for (int k = 0; k < mChildren.length && mChildren[k] != null; ++k) {
        sb.append('(')
          .append("!-=#".charAt(mBondValency[k]))
          .append(mChildren[k])
          .append(')');
      }
      return sb.toString();
    }

    private static int findClosingParen(final String s, final int open) {
      int k = open;
      int numOpen = 1;
      while (numOpen > 0) {
        final char c = s.charAt(++k);
        if (c == '(') {
          ++numOpen;
        } else if (c == ')') {
          --numOpen;
        }
      }
      return k;
    }

    private static int valence(final char c) {
      switch (c) {
        case '-':
          return 1;
        case '=':
          return 2;
        case '#':
          return 3;
        default:
          throw new IllegalArgumentException("Bad bond type: " + c);
      }
    }

    private static void create(final AcyclicAlkyl root, final String mol) {
      int open = 0;
      int k = 0;
      while (open < mol.length()) {
        if (mol.charAt(0) != '(' || mol.charAt(2) != 'C') {
          throw new IllegalArgumentException(mol);
        }
        final int close = findClosingParen(mol, open);
        assert close > open + 2;
        final int valence = valence(mol.charAt(open + 1));
        root.mBondValency[k] = valence;
        root.mUsedValency += valence;
        root.mChildren[k] = create(mol.substring(open + 2, close));
        root.mChildren[k].mUsedValency += valence;
        open = close + 1;
        ++k;
      }
    }

    private static AcyclicAlkyl create(final String mol) {
      if (mol.charAt(0) != 'C') {
        throw new IllegalArgumentException(mol);
      }
      final AcyclicAlkyl root = new AcyclicAlkyl(0);
      create(root, mol.substring(1));
      return root;
    }

  }

  private Set<AcyclicAlkyl> mAkyls = new TreeSet<>();
  private int mN = 0;

  private void generate(final Set<AcyclicAlkyl> unique, final AcyclicAlkyl molecule, final AcyclicAlkyl node) {
    for (int k = 1; k <= Math.min(CARBON_VALENCY - node.mUsedValency, CARBON_VALENCY - 1); ++k) {
      // Can add carbon with valence k as child right here
      int j = 0; // Find first empty bonding slot
      while (node.mChildren[j] != null) {
        ++j;
      }
      node.mChildren[j] = new AcyclicAlkyl(k);
      node.mBondValency[j] = k;
      node.mUsedValency += k;
      final AcyclicAlkyl newMolecule = molecule.copy();
      unique.add(newMolecule.canoncalize());
      // Undo the change
      node.mBondValency[j] = 0;
      node.mChildren[j] = null;
      node.mUsedValency -= k;
    }
    // Recursively deal with any children
    for (int k = 0; k < node.mChildren.length && node.mChildren[k] != null; ++k) {
      generate(unique, molecule, node.mChildren[k]);
    }
  }

  private static final class MyThread extends Thread {
    private final Set<AcyclicAlkyl> mMolecules = new TreeSet<>();

    private MyThread(final Runnable r) {
      super(r);
    }

    private Set<AcyclicAlkyl> getSet() {
      return mMolecules;
    }
  }

  private static final class MyThreadFactory implements ThreadFactory {

    private final ArrayList<Set<AcyclicAlkyl>> mSets = new ArrayList<>();

    @Override
    public Thread newThread(final Runnable r) {
      final MyThread myThread = new MyThread(r);
      mSets.add(myThread.getSet());
      return myThread;
    }

    private Set<AcyclicAlkyl> union() {
      // this is probably the slow part -- single threaded union of sets
      final Set<AcyclicAlkyl> set = new TreeSet<>();
      for (final Set<AcyclicAlkyl> s : mSets) {
        set.addAll(s);
      }
      return set;
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      mAkyls.add(new AcyclicAlkyl(0)); // methane
    } else {
      final MyThreadFactory factory = new MyThreadFactory();
      final ExecutorService exec = Executors.newFixedThreadPool(THREADS, factory);
      final ArrayList<Future<?>> futures = new ArrayList<>();
      try {
        for (final AcyclicAlkyl molecule : mAkyls) {
          futures.add(exec.submit(() -> {
            final MyThread t = (MyThread) Thread.currentThread();
            generate(t.getSet(), molecule, molecule);
          }));
        }
      } finally {
        exec.shutdown();
      }
      try {
        exec.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        for (final Future<?> f : futures) {
          if (f.get() != null) {
            throw new RuntimeException();
          }
        }
      } catch (final InterruptedException | ExecutionException e) {
        throw new UnsupportedOperationException(e);
      }
      mAkyls = factory.union();
    }
    return Z.valueOf(mAkyls.size());
  }

  private static void writeMols(final File file, final Set<AcyclicAlkyl> mols) throws IOException {
    try (final BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(file))) {
      for (final AcyclicAlkyl mol : mols) {
        os.write(mol.toString().getBytes(StandardCharsets.US_ASCII));
        os.write('\n');
      }
    }
  }

  /**
   * Allows various computations using the sequence.
   * @param args see below
   * @throws java.io.IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final CliFlags flags = new CliFlags("A002986", "Generation of acyclic hydrocarbons");
    flags.registerOptional('o', OUTPUT_FLAG, File.class, "file", "name of file to write molecules into");
    flags.registerOptional('i', INPUT_FLAG, File.class, "file", "file of molecules to read and extend");
    flags.registerOptional('n', NUM_CARBONS_FLAG, Integer.class, "int", "number of carbon atoms to generate", Integer.MAX_VALUE);
    flags.setFlags(args);
    final A002986 seq = new A002986();
    if (flags.isSet(INPUT_FLAG)) {
      if (!flags.isSet(OUTPUT_FLAG)) {
        System.err.println("Must set --" + OUTPUT_FLAG + " if --" + INPUT_FLAG + " is used");
        return;
      }
      final TreeSet<AcyclicAlkyl> res = new TreeSet<>();
      try (final BufferedReader r = new BufferedReader(new FileReader((File) flags.getValue(INPUT_FLAG)))) {
        String line;
        while ((line = r.readLine()) != null) {
          final AcyclicAlkyl mol = AcyclicAlkyl.create(line);
          seq.generate(res, mol, mol);
        }
      }
      writeMols((File) flags.getValue(OUTPUT_FLAG), res);
      return;
    }

    final int limit = (Integer) flags.getValue(NUM_CARBONS_FLAG);
    while (seq.mN < limit) {
      final Z count = seq.next();
      System.out.println(seq.mN + " " + count);
    }
    if (flags.isSet(OUTPUT_FLAG)) {
      writeMols((File) flags.getValue(OUTPUT_FLAG), seq.mAkyls);
    }
  }
}
