package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025674 Exponent of 8 (value of j) in n-th number of form 6^i*8^j.
 * @author Sean A. Irvine
 */
public class A025674 extends A025627 {

  @Override
  public Z next() {
    Z r = super.next();
    while (r.mod(6) == 0) {
      r = r.divide(6);
    }
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 3);
  }
}
