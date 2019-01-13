package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A016062.
 * @author Sean A. Irvine
 */
public class A016062 extends A000796 {

  private Z mPrev = Z.ZERO;
  private Z mLookAhead = super.next();

  @Override
  public Z next() {
    Z res = Z.ZERO;
    while (res.compareTo(mPrev) <= 0 || Z.ZERO.equals(mLookAhead)) {
      res = res.multiply(10).add(mLookAhead);
      mLookAhead = super.next();
    }
    mPrev = res;
    return res;
  }
}
