package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025660 Exponent of 6 (value of i) in n-th number of form 6^i*7^j.
 * @author Sean A. Irvine
 */
public class A025660 extends A025626 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(6) == 0) {
      r = r.divide(6);
      ++c;
    }
    return Z.valueOf(c);
  }
}
