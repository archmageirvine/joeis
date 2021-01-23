package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025670 Exponent of 7 (value of i) in n-th number of form 7^i*9^j.
 * @author Sean A. Irvine
 */
public class A025670 extends A025631 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(7) == 0) {
      r = r.divide(7);
      ++c;
    }
    return Z.valueOf(c);
  }
}
