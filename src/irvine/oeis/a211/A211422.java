package irvine.oeis.a211;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A211422 Number of ordered triples (w,x,y) with all terms in {-n,...,0,...,n} and w^2 + x*y = 0.
 * @author Georg Fischer
 */
public class A211422 implements Sequence {

  /**
   * Four longs.
   */
  @FunctionalInterface
  public interface Long4Cond {
    boolean evaluate(long n, long w, long x, long y);
  }

  protected Function<Long, Long[]> mRange;
  protected Long4Cond mCond;
  private long mN;

  /** Construct the sequence. */
  public A211422() {
    this(0, n -> new Long[] {-n, n}, (n, w, x, y) -> w * w + x * y == 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param range index range (low, high)
   * @param cond condition for the n and the 4 terms to be counted
   */
  public A211422(final int offset, final Function<Long, Long[]> range, final Long4Cond cond) {
    mRange = range;
    mCond = cond;
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
          if (mCond.evaluate(n, w, x, y)) {
            ++result;
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
