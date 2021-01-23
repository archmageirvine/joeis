package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025690 Exponent of 10 (value of j) in n-th number of form 8^i*10^j.
 * @author Sean A. Irvine
 */
public class A025690 extends A025634 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(10) == 0) {
      r = r.divide(10);
      ++c;
    }
    return Z.valueOf(c);
  }
}
