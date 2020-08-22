package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025659 Exponent of 6 (value of j) in n-th number of form 5^i*6^j.
 * @author Sean A. Irvine
 */
public class A025659 extends A025622 {

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
