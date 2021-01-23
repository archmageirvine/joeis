package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025647 Exponent of 4 (value of i) in n-th number of form 4^i*6^j.
 * @author Sean A. Irvine
 */
public class A025647 extends A025618 {

  @Override
  public Z next() {
    Z r = super.next();
    while (r.mod(6) == 0) {
      r = r.divide(6);
    }
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 2);
  }
}
