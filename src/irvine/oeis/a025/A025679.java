package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025679 Exponent of 9 (value of j) in n-th number of form 5^i*9^j.
 * @author Sean A. Irvine
 */
public class A025679 extends A025624 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(9) == 0) {
      r = r.divide(9);
      ++c;
    }
    return Z.valueOf(c);
  }
}
