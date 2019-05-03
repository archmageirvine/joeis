package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A013943 Length of period of continued fraction for <code>sqrt(m), m = n-th</code> nonsquare.
 * @author Sean A. Irvine
 */
public class A013943 extends A003285 {

  @Override
  public Z next() {
    Z res = super.next();
    if (Z.ZERO.equals(res)) {
      res = super.next();
    }
    return res;
  }
}
