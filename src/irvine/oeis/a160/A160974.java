package irvine.oeis.a160;
// manually 2020-10-22, for partcapp.jpat

import irvine.math.MemoryFunctionInt2Array;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A160974 Number of partitions of n where every part appears at least 4 times.
 * @author Georg Fischer
 */
public class A160974 extends MemoryFunctionInt2Array<Z> implements Sequence {

  protected final int mAppears; // every part appears at least this many times.
  protected int mN; // index of next term
  
  /** Construct with default parameters. */
  public A160974() {
    this(0, 4);
  }

  /**
   * Construct the sequence.
   * @param appears how often every part appears
   */
  public A160974(final int offset, final int appears) {
    mAppears = appears;
    mN = offset - 1;
  }

  /**
   * Recursively evaluate all partitions and accumulate information for the condition
   * @param n number to be partitioned
   * @param i nesting level
   * @param cn not used here
   * @return number of partitions of n with this condition
   */
  @Override
  protected Z compute(final int n, final int i, final int[] cn) {
    final Z result;
    if (n == 0) {
      result = total(cn);
    } else {
      if (i < 1) {
        result = Z.ZERO;
      } else {
        final int iSub1 = i - 1;
        final int nDivI = n / i;
        Z sum = compute(n, iSub1, cn); 
        int j = mAppears;
        while (j <= nDivI) {
            sum = sum.add(compute(n - i * j, iSub1, cn)); 
            ++j;
        }
        result = sum;
      }
    }
    return result;
  }

  /**
   * Returns the resulting number of partitions computed by the recursive method.
   * @param cn array of the additional parameters of the recursive method {@link #compute}.
   * @return number of partitions
   */
  protected Z total(final int[] cn) {
    return Z.ONE;
  }

  /**
   * Compute the next term of the sequence
   * @return a specific number of partitions
   */
  @Override
  public Z next() {
    ++mN;
    return get(mN, mN, new int[0]);
  }
}
