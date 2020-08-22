package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025656 Exponent of 6 (value of j) in n-th number of form 2^i*6^j.
 * @author Sean A. Irvine
 */
public class A025656 extends A025610 {

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
