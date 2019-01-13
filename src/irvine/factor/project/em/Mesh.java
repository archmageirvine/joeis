package irvine.factor.project.em;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import irvine.factor.factor.CachedFactorizer;
import irvine.factor.factor.EcmFactorizer;
import irvine.factor.factor.FactorDbFactorizer;
import irvine.factor.factor.Factorizer;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.util.CliFlags;
import irvine.util.string.StringUtils;

/**
 * Check and report status of entire Euclid-Mullin mesh.
 * @author Sean A. Irvine
 */
public class Mesh {

  private static final int NUM_COMPOSITES_TO_PRINT = 50;
  private static final int MAX_LEVEL = 1000; // Way larger than needed for conceivable future, only for stats anyway
  private static final int MAX_EXTEND_LEVEL = 19;
  private static final int HARD_BIT_LENGTH = 214;
  private static final boolean NO_ECM = "true".equals(System.getProperty("no.ecm"));

  private static final class MeshNode implements Comparable<MeshNode> {

    private static final HashSet<Z> PRODUCTS = new HashSet<>();
    private static final Factorizer TRIAL_DIVISION_FACTORIZER = new PrimeDivision(10000000L);
    private static final Factorizer FACTOR_DB_FACTORIZER = new CachedFactorizer(new FactorDbFactorizer());
    private static final Factorizer ECM_FACTORIZER = NO_ECM ? null : new EcmFactorizer(10000.0, 100);
    private static final int TRIAL_DIVISION_TO_10M = 1;
    private static final int ECM_10000 = 2;
    private static final int FACTORIZATION_LIMIT = 700;
    private static int sFactorizationsAttempted = 0;
    private static int sFactorizationsSkipped = 0;

    private final int mLevel;
    private final Z mValue;
    private final Z mProduct;
    private final int mStatus;
    private int mExponent;
    private final MeshNode mParent;
    private final TreeSet<MeshNode> mChildren = new TreeSet<>();
    private int mFactorFlag = 0;

    private MeshNode(final int level, final Z value, final int exponent, final int primeStatus, final MeshNode parent) {
      mLevel = level;
      mValue = value;
      mExponent = exponent;
      mStatus = primeStatus;
      mParent = parent;

      if (parent == null) {
        mProduct = mValue.pow(exponent);
      } else {
        mProduct = parent.getProduct().multiply(mValue);
      }

      if (!PRODUCTS.add(mProduct)) {
        System.out.println("Mesh collision: " + mProduct + " level=" + mLevel);
      }
    }

    private int getLevel() {
      return mLevel;
    }

    private MeshNode getParent() {
      return mParent;
    }

    private int getStatus() {
      return mStatus;
    }

    private int getExponent() {
      return mExponent;
    }

    private void incrementExponent(final int value) {
      mExponent += value;
    }

    private Z getProduct() {
      return mProduct;
    }

    private Z getValue() {
      return mValue;
    }

    private Set<MeshNode> getChildren() {
      return mChildren;
    }

    private void add(final MeshNode node) {
      assert node.getLevel() == getLevel() + 1 : "Parent=" + mProduct + " (lev=" + mLevel + ") adding (lev=" + node.mLevel + ")";
      // Care is needed here with exponents
      final Z n = node.getValue();
      for (final MeshNode existing : mChildren) {
        if (existing.getValue().equals(n)) {
          System.out.println("Attempt to add same value as a child multiple times " + node.getValue() + " level=" + getLevel() + " (fixing exponent in existing entry)");
          existing.incrementExponent(node.getExponent());
          return;
        }
      }
      mChildren.add(node);
    }

    private void setFactorBits(final int v) {
      mFactorFlag |= v;
    }

    private int getFactorFlag() {
      return mFactorFlag;
    }

    String trace() {
      final ArrayList<Z> valuesInReverse = new ArrayList<>();
      MeshNode current = this;
      while (current != null) {
        valuesInReverse.add(current.getValue());
        current = current.getParent();
      }
      final StringBuilder sb = new StringBuilder();
      for (int k = valuesInReverse.size() - 1; k >= 0; --k) {
        if (sb.length() > 0) {
          sb.append('*');
        }
        sb.append(valuesInReverse.get(k));
      }
      return sb.toString();
    }

    private void write(final PrintStream out) {
      final StringBuilder sb = new StringBuilder();
      sb.append(StringUtils.rep('.', getLevel()));
      if (getStatus() == FactorSequence.PRIME) {
        sb.append(getValue());
      } else {
        sb.append('(').append(getValue()).append(')');
        if (getFactorFlag() != 0) {
          sb.append(getFactorFlag());
        }
      }
      if (getExponent() != 1) {
        sb.append('^').append(getExponent());
      }
      out.println(sb.toString());
      for (final MeshNode node : getChildren()) {
        node.write(out);
      }
    }

    private void validateProductsAndAddMissingComposites(final boolean validate) {
      final Set<MeshNode> children = getChildren();
      if (children.isEmpty()) {
        if (getStatus() == FactorSequence.PRIME) {
          // Add an unresolved composite
          final Z n = getProduct().add(1);
          final int level = getLevel() + 1;
          System.out.println("Added missing composite at level " + level + ": " + n);
          final MeshNode next = new MeshNode(level, n, 1, n.isProbablePrime() ? FactorSequence.PRIME : FactorSequence.COMPOSITE, this);
          children.add(next);
        }
        return;
      }
      if (validate) {
        // Validate this node
        Z prod = Z.ONE;
        for (final MeshNode c : getChildren()) {
          prod = prod.multiply(c.getValue().pow(c.getExponent()));
        }
        final Z t = getProduct().add(1);
        if (!t.equals(prod)) {
          // Add in any expansions which are partially missing for reasons unknown
          if (Z.ZERO.equals(t.mod(prod))) {
            final Z rem = t.divide(prod);
            final MeshNode next = new MeshNode(getLevel() + 1, rem, 1, rem.isProbablePrime() ? FactorSequence.PRIME : FactorSequence.COMPOSITE, this);
            add(next);
            System.out.println("Added missing factor: " + rem);
          } else {
            System.out.println("Product mismatch: " + prod + " " + getProduct() + " trace " + trace() + " Disconnecting and replacing.");
            mChildren.clear();
            final MeshNode next = new MeshNode(getLevel() + 1, t, 1, t.isProbablePrime() ? FactorSequence.PRIME : FactorSequence.COMPOSITE, this);
            add(next);
          }
        }
      }
      // Do the children
      for (final MeshNode c : getChildren()) {
        c.validateProductsAndAddMissingComposites(validate);
      }
    }

    private void getPrimeLevels(final Map<Z, Integer> levelMap) {
      if (getStatus() == FactorSequence.PRIME) {
        final Z p = getValue();
        final Integer current = levelMap.get(p);
        if (current == null || current > getLevel()) {
          levelMap.put(p, getLevel());
        }
        for (final MeshNode c : getChildren()) {
          c.getPrimeLevels(levelMap);
        }
      }
    }

    private void getComposites(final List<TreeSet<Z>> composites) {
      if (getStatus() == FactorSequence.COMPOSITE) {
        final int level = getLevel();
        while (composites.size() <= level) {
          composites.add(new TreeSet<>());
        }
        composites.get(level).add(getValue());
      }
      for (final MeshNode c : getChildren()) {
        c.getComposites(composites);
      }
    }

    private void getLevelCounts(final long[] counts) {
      if (getLevel() < counts.length && getStatus() == FactorSequence.PRIME) {
        counts[getLevel()]++;
        for (final MeshNode c : getChildren()) {
          c.getLevelCounts(counts);
        }
      }
    }

    private boolean explore(final int level, final int bitLength) {
      return level <= MAX_EXTEND_LEVEL || bitLength <= HARD_BIT_LENGTH;
    }

    /* Use cached factorizer to attempt to extend existing composites. */
    private void extend(final boolean useFactorDb, final int factorDbLevel, final int skipLimit) {
      final int level = getLevel();
      final int bitLength = getValue().bitLength();
      if (!explore(level, bitLength)) {
        return;
      }
      if (getStatus() == FactorSequence.COMPOSITE) {
        final FactorSequence fs = new FactorSequence(getValue());
        if ((getFactorFlag() & TRIAL_DIVISION_TO_10M) == 0) {
          //System.out.println("Attempting trial division level " + level + " on " + getValue());
          TRIAL_DIVISION_FACTORIZER.factor(fs);
          setFactorBits(TRIAL_DIVISION_TO_10M);
        }
        if (ECM_FACTORIZER != null && (getFactorFlag() & ECM_10000) == 0 && !fs.isComplete() && (level <= Math.max(15, factorDbLevel) || bitLength <= HARD_BIT_LENGTH)) {
          ECM_FACTORIZER.factor(fs);
          setFactorBits(ECM_10000);
        }
        // factordb limits number of factorizations on an hourly basis
        if (useFactorDb && level <= factorDbLevel && !fs.isComplete() && ++sFactorizationsSkipped > skipLimit && ++sFactorizationsAttempted <= FACTORIZATION_LIMIT) {
          FACTOR_DB_FACTORIZER.factor(fs);
        }
        final Z[] factors = fs.toZArray();
        if (factors.length > 1) { // at least one new factor found
          System.out.println("Successfully factored level " + level + ": " + getValue());
          final MeshNode parent = getParent();
          parent.getChildren().remove(this);
          for (final Z p : fs.toZArray()) {
            final int st = fs.getStatus(p);
            final boolean considerPrime = st == FactorSequence.PRIME || st == FactorSequence.PROB_PRIME;
            final MeshNode child = new MeshNode(level, p, fs.getExponent(p), considerPrime ? FactorSequence.PRIME : FactorSequence.COMPOSITE, parent);
            parent.add(child);
            // If child is a prime, then we can further extend the tree.  The code will still work
            // if this is removed, but must be then be run multiple times to achieve the same result.
            // This condition is what can make the tree depth go up quickly.
            if (child.getStatus() == FactorSequence.PRIME) {
              final Z n = child.getProduct().add(1);
              final boolean nIsPrime = n.isProbablePrime();
              final MeshNode childsChild = new MeshNode(level + 1, n, 1, nIsPrime ? FactorSequence.PRIME : FactorSequence.COMPOSITE, child);
              child.add(childsChild);
            }
          }
        }
      }
      // Need copy here to prevent potential ConcurrentModificationException
      for (final MeshNode c : new ArrayList<>(getChildren())) {
        c.extend(useFactorDb, factorDbLevel, skipLimit);
      }
    }
    
    void getSmallest(final List<MeshNode> smallest) {
      final int level = getLevel();
      if (level == smallest.size()) {
        smallest.add(this);
      } else if (smallest.get(level).getProduct().compareTo(getProduct()) > 0) {
        smallest.set(level, this);
      }
      for (final MeshNode c : getChildren()) {
        c.getSmallest(smallest);
      }
    }
    
    @Override
    public int compareTo(final MeshNode other) {
      return mValue.compareTo(other.mValue);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof MeshNode && ((MeshNode) obj).mValue.equals(mValue);
    }

    @Override
    public int hashCode() {
      return mValue.hashCode();
    }
  }

  private final ArrayList<String> mHeader = new ArrayList<>();
  private final MeshNode mRoot = new MeshNode(0, Z.ONE, 1, FactorSequence.PRIME, null);

  Mesh(final File source, final boolean validate) throws IOException {
    try (final BufferedReader r = new BufferedReader(new FileReader(source))) {
      MeshNode current = mRoot;
      String line;
      while ((line = r.readLine()) != null) {
        if (line.isEmpty()) {
          continue;
        }
        if (line.startsWith("#")) {
          mHeader.add(line);
        } else if (!"1".equals(line)) {
          final int level = line.lastIndexOf('.') + 1;
          String num = line.substring(level);
          final int hat = num.indexOf('^');
          final int exponent;
          if (hat != -1) {
            exponent = Integer.parseInt(num.substring(hat + 1));
            num = num.substring(0, hat);
          } else {
            exponent = 1;
          }
          final int status;
          final Z n;
          int factorFlag = 0;
          if (num.startsWith("(")) {
            final int close = num.indexOf(')');
            n = new Z(num.substring(1, close));
            if (validate) {
              if (n.isProbablePrime()) {
                System.out.println("Claimed composite " + n + " appears to be prime (correcting)");
                status = FactorSequence.PRIME;
              } else {
                status = FactorSequence.COMPOSITE;
              }
            } else {
              status = FactorSequence.COMPOSITE;
            }
            if (close != num.length() - 1) {
              factorFlag = Integer.parseInt(num.substring(close + 1));
            }
          } else {
            n = new Z(num);
            if (validate) {
              if (!Z.ONE.equals(n) && !n.isProbablePrime()) {
                System.out.println("Claimed prime " + n + " appears to be composite (correcting)");
                status = FactorSequence.COMPOSITE;
              } else {
                status = FactorSequence.PRIME;
              }
            } else {
              status = FactorSequence.PRIME;
            }
          }
          while (level < current.getLevel() + 1) {
            current = current.getParent();
          }
          final MeshNode newNode = new MeshNode(level, n, exponent, status, current);
          if (factorFlag != 0) {
            newNode.setFactorBits(factorFlag);
          }
          current.add(newNode);
          current = newNode;
        }
      }
    }
  }

  void write(final PrintStream out) {
    for (final String h : mHeader) {
      out.println(h);
    }
    mRoot.write(out);
  }

  private static final String INPUT_FLAG = "input";
  private static final String PRIME_LEVEL_FLAG = "prime-level";
  private static final String EXTEND_FLAG = "extend";
  private static final String SHOW_COMPOSITES_FLAG = "show-composites";
  private static final String SHOW_COMPOSITES_BY_LEVEL_FLAG = "show-level-composites";
  private static final String LEVEL_SUMMARY_FLAG = "level-summary";
  private static final String FACTORDB_FLAG = "factordb";
  private static final String FACTORDB_SKIP_FLAG = "skip";
  private static final String VALIDATE_FLAG = "validate";
  private static final String SMALLEST_FLAG = "smallest";
  private static final String PRIME_CHAINS_FLAG = "chains";
  private static final String MERGE_FLAG = "merge";

  private static File getBackUpFile(final File file) {
    int k = 0;
    File res;
    do {
      res = new File(file.getPath() + "." + k++);
    } while (res.exists());
    return res;
  }

  void writeSmallest(final PrintStream out) {
    final ArrayList<MeshNode> smallest = new ArrayList<>();
    mRoot.getSmallest(smallest);
    for (int k = 0; k < smallest.size(); ++k) {
      out.println(k + "\t" + smallest.get(k).trace());
    }
  }

  void writeLevelSummary(final PrintStream out, final List<TreeSet<Z>> composites) {
    final long[] counts = new long[MAX_LEVEL];
    mRoot.getLevelCounts(counts);
    System.out.println("Level\tNodes\tComposites");
    for (int k = 0; k < counts.length; ++k) {
      if (counts[k] != 0) {
        out.println(k + "\t" + counts[k] + "\t" + composites.get(k).size());
      }
    }
  }

  void writeComposites(final PrintStream out, final List<TreeSet<Z>> composites) {
    int printed = 0;
    for (int k = 0; k < composites.size() && printed < NUM_COMPOSITES_TO_PRINT; ++k) {
      final TreeSet<Z> c = composites.get(k);
      if (!c.isEmpty()) {
        out.println("Level " + k + " composites");
        for (final Z v : c) {
          out.println("C" + v.toString().length() + " " + v);
          if (++printed >= NUM_COMPOSITES_TO_PRINT) {
            break;
          }
        }
      }
    }
  }

  void writeSmallestCompositeAtEachLevel(final PrintStream out, final List<TreeSet<Z>> composites) {
    for (int k = 0; k < composites.size(); ++k) {
      final TreeSet<Z> c = composites.get(k);
      if (!c.isEmpty()) {
        final Z v = c.first();
        out.println(k + " C" + v.toString().length() + " " + v);
      }
    }
  }

  void merge(final MeshNode node, final Set<Z> nodesToMerge) {
    if (nodesToMerge.isEmpty()) {
      return;
    }

    for (final MeshNode n : new HashSet<>(node.getChildren())) {
      final Z value = n.getValue();
      if (n.getStatus() == FactorSequence.PRIME) {
        final HashSet<Z> compatible = new HashSet<>();
        for (final Z v : nodesToMerge) {
          if (!v.equals(value) && Z.ZERO.equals(v.mod(value))) {
            compatible.add(v.divide(value));
          }
        }
        merge(n, compatible);
      } else {
        for (final Z v : nodesToMerge) {
          if (!v.equals(value) && Z.ZERO.equals(value.mod(v))) {
            // i.e. v is a factor of value
            final boolean considerPrime = v.isProbablePrime();
            if (considerPrime) {
              final int level = n.getLevel();
              final MeshNode parent = n.getParent();
              parent.getChildren().remove(n);
              final MeshNode child = new MeshNode(level, v, 1, FactorSequence.PRIME, parent);
              parent.add(child);
              final Z leftOver = value.divide(v);
              if (leftOver.compareTo(Z.ONE) > 0) {
                final MeshNode rest = new MeshNode(level, leftOver, 1, leftOver.isProbablePrime() ? FactorSequence.PRIME : FactorSequence.COMPOSITE, parent);
                parent.add(rest);
              }
              System.out.println("Merged a node: " + v + " and " + leftOver + " @ level " + level + " replacing former composite " + n.getValue() + " prod was " + n.getProduct());
              break; // For safety merge at most one node extension per node
            }
          }
        }
      }
    }
  }

  static void writePrimeChains(final PrintStream out, final MeshNode root) {
    long lengthOfChain = 0;
    MeshNode n = root;
    while (n.getChildren().size() == 1 && n.getStatus() == FactorSequence.PRIME) {
      ++lengthOfChain;
      n = n.getChildren().iterator().next();
    }
    if (lengthOfChain > 3) {
      out.println(lengthOfChain + " " + root.getProduct() + " " + n.getChildren().size());
    }
    for (final MeshNode v : n.getChildren()) {
      writePrimeChains(out, v);
    }
  }

  private static Set<Z> loadAndrew(final BufferedReader r) throws IOException {
    final Set<Z> res = new HashSet<>();
    String line;
    while ((line = r.readLine()) != null) {
      res.add(new Z(line));
    }
    return res;
  }

  /**
   * Main program for the Euclid-Mullin mesh.
   * @param args args
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String... args) throws IOException {
    final CliFlags flags = new CliFlags("Mesh", "Compute and check the Euclid-Mullin mesh");
    flags.registerRequired('i', INPUT_FLAG, File.class, "file", "Mesh file");
    flags.registerOptional('p', PRIME_LEVEL_FLAG, "Display the level where a prime first occurs");
    flags.registerOptional('e', EXTEND_FLAG, "Extend tables using trial division and ecm");
    flags.registerOptional('c', SHOW_COMPOSITES_FLAG, "Show the lowest level remaining composites");
    flags.registerOptional('C', SHOW_COMPOSITES_BY_LEVEL_FLAG, "Show the lowest level remaining composite at each level");
    flags.registerOptional('l', LEVEL_SUMMARY_FLAG, "Display the number of nodes and remaining composites at each level");
    flags.registerOptional('f', FACTORDB_FLAG, Integer.class, "level", "Use factordb during extension");
    flags.registerOptional('d', FACTORDB_SKIP_FLAG, Integer.class, "count", "How many factordb calls to skip before making real calls", 0);
    flags.registerOptional('v', VALIDATE_FLAG, "Valid all the products in the mesh");
    flags.registerOptional('s', SMALLEST_FLAG, "Print the smallest node at each level");
    flags.registerOptional('w', PRIME_CHAINS_FLAG, "Write out prime chains then exit");
    flags.registerOptional('m', MERGE_FLAG, File.class, "file", "Merge a nodes file");
    flags.setFlags(args);
    final File file = (File) flags.getValue(INPUT_FLAG);
    final Mesh mesh = new Mesh(file, flags.isSet(VALIDATE_FLAG));
    if (flags.isSet(MERGE_FLAG)) {
      try (final BufferedReader r = new BufferedReader(new FileReader((File) flags.getValue(MERGE_FLAG)))) {
        final Set<Z> toMerge = loadAndrew(r);
        mesh.merge(mesh.mRoot, toMerge);
      }
    }
    mesh.mRoot.validateProductsAndAddMissingComposites(flags.isSet(VALIDATE_FLAG));
    if (flags.isSet(PRIME_CHAINS_FLAG)) {
      writePrimeChains(System.out, mesh.mRoot);
      return;
    }
    if (flags.isSet(EXTEND_FLAG)) {
      System.out.println("Extending tree");
      final boolean useFactorDb = flags.isSet(FACTORDB_FLAG);
      final int factorDbLevel = useFactorDb ? (Integer) flags.getValue(FACTORDB_FLAG) : 0;
      mesh.mRoot.extend(useFactorDb, factorDbLevel, (Integer) flags.getValue(FACTORDB_SKIP_FLAG));
    }
    System.out.println("Writing tree");
    if (!file.renameTo(getBackUpFile(file))) {
      System.out.println("Rename of existing file failed");
    }
    try (final PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      mesh.write(out);
    }
    final List<TreeSet<Z>> composites = new ArrayList<>();
    mesh.mRoot.getComposites(composites);
    if (flags.isSet(SHOW_COMPOSITES_FLAG)) {
      mesh.writeComposites(System.out, composites);
    }
    if (flags.isSet(SHOW_COMPOSITES_BY_LEVEL_FLAG)) {
      mesh.writeSmallestCompositeAtEachLevel(System.out, composites);
    }
    if (flags.isSet(SMALLEST_FLAG)) {
      mesh.writeSmallest(System.out);
    }
    if (flags.isSet(LEVEL_SUMMARY_FLAG)) {
      mesh.writeLevelSummary(System.out, composites);
    }
    final HashMap<Z, Integer> levels = new HashMap<>();
    mesh.mRoot.getPrimeLevels(levels);
    final Fast primes = new Fast();
    Z p = Z.TWO;
    Integer lev;
    while ((lev = levels.get(p)) != null) {
      if (flags.isSet(PRIME_LEVEL_FLAG)) {
        System.out.println(p + "\t" + lev);
      }
      p = primes.nextPrime(p);
    }
    System.out.println("First prime not yet in mesh: " + p);
  }
}
