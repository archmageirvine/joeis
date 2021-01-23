package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A013943 Length of period of continued fraction for sqrt(m), m = n-th nonsquare.
 * @author Sean A. Irvine
 */
public class A013943 extends A003285 {

  @Override
  public Z next() {
    Z res = super.next();
    if (res.isZero()) {
      res = super.next();
    }
    return res;
  }
}
