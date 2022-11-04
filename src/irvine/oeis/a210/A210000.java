package irvine.oeis.a210;

import java.util.function.BiFunction;
import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A210000 Number of unimodular 2 X 2 matrices having all terms in {0,1,...,n}.
 * @author Georg Fischer
 */
public class A210000 implements Sequence {

  /**
   * Four longs.
   */
  @FunctionalInterface
  public interface Long4 {
    /**
     * Evaluate a function.
     * @param w parameter
     * @param x parameter
     * @param y parameter
     * @param z parameter
     * @return evaluation
     */
    long evaluate(long w, long x, long y, long z);
  }

  protected Function<Long, Long[]> mRange;
  protected BiFunction<Long, Long, Boolean> mCond;
  protected Long4 mLong4;
  private long mN;

  /** Construct the sequence. */
  public A210000() {
    this(0, n -> new Long[] {0L, n}, (w, x, y, z) -> w * z - x * y, (d, n) -> d == 1 || d == -1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param range index range (low, high)
   * @param cond condition for the discriminant to be counted
   * @param aggr a function of the 4 terms: discriminant, permanent or sum of terms
   */
  public A210000(final int offset, final Function<Long, Long[]> range, final Long4 aggr, final BiFunction<Long, Long, Boolean> cond) {
    mRange = range;
    mCond = cond;
    mLong4 = aggr;
    mN = offset - 1;
  }

  /**
   * Count the number of aggregated values fulfilling the condition in a range
   * @param n current index
   * @return count
   */
  protected Z count(final long n) {
    final Long[] ab = mRange.apply(n);
    final long a = ab[0];
    final long b = ab[1];
    long result = 0;
    for (long w = a; w <= b; ++w) {
      for (long x = a; x <= b; ++x) {
        for (long y = a; y <= b; ++y) {
          for (long z = a; z <= b; ++z) {
            final long dps = mLong4.evaluate(w, x, y, z);
            if (mCond.apply(dps, n)) {
              ++result;
            }
          }
        }
      }
    }
    return Z.valueOf(result);
  }

  @Override
  public Z next() {
    ++mN;
    return count(mN);
  }
}
