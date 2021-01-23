package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025684 Exponent of 10 (value of j) in n-th number of form 2^i*10^j.
 * @author Sean A. Irvine
 */
public class A025684 extends A025612 {

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
