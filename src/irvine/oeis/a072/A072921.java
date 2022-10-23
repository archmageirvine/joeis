package irvine.oeis.a072;
// manually 2021-10-21

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A072921 a(1)=1; a(n) = a(n-1) + [sum of all decimal digits present so far in the sequence].
 * <code>a(1)=1, a(2)=2; a(n+1)=2*a(n)-a(n-1)+sod(a(n))</code> (sod = "sum of digits"): 1, 2, 5, 13, 25
 * @author Georg Fischer
 */
public class A072921 extends Sequence1 {

  private final Z mStart;
  private Z mA1;
  private Z mA2;

  /** Construct the sequence. */
  public A072921() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param start start position
   */
  public A072921(final long start) {
    mStart = Z.valueOf(start);
    mA2 = mStart.negate();
    mA1 = Z.ZERO;
  }

  @Override
  public Z next() {
    final Z result = mA1.multiply2().subtract(mA2).add(ZUtils.digitSum(mA1));
    mA2 = mA1.isZero() ? mStart : mA1;
    mA1 = result;
    return result;
  }
}
