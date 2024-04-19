package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050999 Sum of squares of odd divisors of n.
 * @author Sean A. Irvine
 */
public class A050999 extends Sequence1 {

  private final int mPow;
  private long mN = 0;

  /** Construct the sequence. */
  public A050999() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param pow power of the divisor
   */
  public A050999(final int pow) {
    mPow = pow;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.isOdd()) {
        sum = sum.add(d.pow(mPow));
      }
    }
    return sum;
  }
}
