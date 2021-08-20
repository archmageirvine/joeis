package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A050819 Increasing odd numbers seen in decimal expansion of Pi (disregarding the decimal period) contiguous, smallest and distinct.
 * @author Sean A. Irvine
 */
public class A050819 extends A000796 {

  private Z mPrev = Z.ZERO;
  private Z mLookahead = super.next();

  @Override
  public Z next() {
    Z t = Z.ZERO;
    while (t.isEven() || t.compareTo(mPrev) <= 0 || mLookahead.isZero()) {
      t = t.multiply(10).add(mLookahead);
      mLookahead = super.next();
    }
    mPrev = t;
    return t;
  }
}
