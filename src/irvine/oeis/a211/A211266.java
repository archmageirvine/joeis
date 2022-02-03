package irvine.oeis.a211;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A211266 Number of integer pairs (x,y) such that 0&lt;x&lt;y&lt;=n and x*y&lt;=2n.
 * @author Georg Fischer
 */
public class A211266 implements Sequence {

  /**
   * Three longs.
   */
  @FunctionalInterface
  public interface Long3Cond {
    boolean evaluate(long n, long y, long z);
  }

  protected Long3Cond mCond;
  protected long mRange;
  private long mN;

  /** Construct the sequence. */
  public A211266() {
    this(1, 1, (n, x, y) -> x * y <= 2 * n);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param range start of terms
   * @param cond condition for the n and the 4 terms to be counted
   */
  public A211266(final int offset, final int range, final Long3Cond cond) {
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
    final long a = 1;
    final long b = n;
    long result = 0;
    for (long x = a; x <= b - 1; ++x) {
      for (long y = x + mRange; y <= b; ++y) {
        if (mCond.evaluate(n, x, y)) {
          ++result;
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
