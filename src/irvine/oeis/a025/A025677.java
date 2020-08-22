package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025677 Exponent of 8 (value of i) in n-th number of form 8^i*10^j.
 * @author Sean A. Irvine
 */
public class A025677 extends A025634 {

  @Override
  public Z next() {
    Z r = super.next();
    while (r.mod(10) == 0) {
      r = r.divide(10);
    }
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 3);
  }
}
