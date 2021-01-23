package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025655 Exponent of 5 (value of i) in n-th number of form 5^i*10^j.
 * @author Sean A. Irvine
 */
public class A025655 extends A025625 {

  @Override
  public Z next() {
    Z r = super.next();
    while (r.mod(10) == 0) {
      r = r.divide(10);
    }
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(5);
      ++c;
    }
    return Z.valueOf(c);
  }
}
