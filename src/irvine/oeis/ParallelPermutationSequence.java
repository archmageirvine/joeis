package irvine.oeis;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import irvine.math.z.Z;

/**
 * Generate a sequence where the underlying objects are permutations of integers.
 * This class supports incremental construction of the permutations with checking
 * as each element of the permutation is select and a final evaluation returning
 * a count to be associated with the permutation.
 * The elements of the permutation are <code>0..(n-1)</code>.
 * The computation can be carried out in parallel with an ability to use up to
 * <code>n(n-1)</code> cores, where <code>n</code> is the current term number.
 * If no methods are overridden this simply provides a slow way of computing
 * <code>n!</code>.
 * @author Sean A. Irvine
 */
public class ParallelPermutationSequence extends AbstractSequence implements DirectSequence {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private static final int[] EMPTY = {};
  private static final int[] UNIT = {0};
  private static final int[] TWO0 = {0, 1};
  private static final int[] TWO1 = {1, 0};

  protected int mN;

  /**
   * Construct a new sequence.
   * @param offset sequence offset
   */
  public ParallelPermutationSequence(final int offset) {
    super(offset);
    mN = offset - 1;
  }

  /**
   * Construct a new permutation sequence starting from 0.
   */
  public ParallelPermutationSequence() {
    this(0);
  }

  /**
   * Test if a partially constructed permutation is acceptable.
   * The elements in positions <code>0..(pos-1)</code> are set when this
   * function is called, remaining elements should be ignored.
   * This method must be re-entrant.
   * @param p the (partial) permutation
   * @param pos exclusive upper bound on set values in p
   * @return true iff exploration of this permutation should continue
   */
  protected boolean accept(final int[] p, final int pos) {
    return true;
  }

  /**
   * Process a completed permutation. This method should return the
   * contribution of the current permutation to the sequence being computed.
   * The default is simply to return 1, indicating the permutation should
   * be counted.
   * This method must be re-entrant.
   * @param p permutation
   * @return the count
   */
  protected long count(final int[] p) {
    return 1;
  }

  /** "Importunate" is an anagram of "permutation". */
  private class Importunate {

    private Z mCount = Z.ZERO;
    private final int[] mP;

    private Importunate(final int n, final int p0, final int p1) {
      mP = new int[n];
      mP[0] = p0;
      mP[1] = p1;
      for (int k = 2, j = 0; k < n; ++k, ++j) {
        while (j == p0 || j == p1) {
          ++j;
        }
        mP[k] = j;
      }
    }

    private void search(final int pos) {
      if (pos == mP.length) {
        mCount = mCount.add(count(mP));
        return;
      }
      // Simply take the next element
      if (accept(mP, pos + 1)) {
        search(pos + 1);
      }
      // Swap (pos, k) for following k
      final int t = mP[pos];
      for (int k = pos + 1; k < mP.length; ++k) {
        mP[pos] = mP[k];
        mP[k] = t;
        if (accept(mP, pos + 1)) {
          search(pos + 1);
        }
        mP[k] = mP[pos];
      }
      mP[pos] = t;
    }
  }

  @Override
  public Z a(final int n) {
    Z count = Z.ZERO;
    switch (n) {
      case 0:
        if (accept(EMPTY, 0)) {
          count = count.add(count(EMPTY));
        }
        break;
      case 1:
        if (accept(UNIT, 1)) {
          count = count.add(count(UNIT));
        }
        break;
      case 2:
        if (accept(TWO0, 2)) {
          count = count.add(count(TWO0));
        }
        if (accept(TWO1, 2)) {
          count = count.add(count(TWO1));
        }
        break;
      default:
        // Split work on first two elements of permutation
        final ExecutorService executor = Executors.newFixedThreadPool(THREADS);
        final ArrayList<Importunate> jobs = new ArrayList<>();
        for (int p0 = 0; p0 < n; ++p0) {
          for (int p1 = 0; p1 < n; ++p1) {
            if (p0 != p1) {
              final Importunate job = new Importunate(n, p0, p1);
              jobs.add(job);
              executor.submit(() -> {
                job.search(2); // elements 0 and 1 already selected
              });
            }
          }
        }
        executor.shutdown();
        try {
          // Ten years!
          if (!executor.awaitTermination(3650, TimeUnit.DAYS)) {
            throw new RuntimeException("Timeout");
          }
        } catch (final InterruptedException e) {
          Thread.currentThread().interrupt();  // Restore interrupt status
          throw new RuntimeException(e);
        }
        for (final Importunate job : jobs) {
          count = count.add(job.mCount);
        }
        break;
    }
    return count;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  /**
   * Run a particular value of a subclass of this sequence.
   * @param args n
   */
  public static void main(final String... args) {
    final int n = Integer.parseInt(args[0]);
    // Determine the name of the class that invoked the main method
    final String command = System.getProperty("sun.java.command");
    final String subclassName = command.substring(0, command.indexOf(' '));
    try {
      final Class<?> clazz = Class.forName(subclassName);
      if (DirectSequence.class.isAssignableFrom(clazz)) {
        // Instantiate the subclass using the no-arg constructor
        final DirectSequence sequenceInstance = (DirectSequence) clazz.getDeclaredConstructor().newInstance();
        System.out.println(sequenceInstance.a(n));
      } else {
        throw new RuntimeException(); // should not happen
      }
    } catch (final ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }
}
