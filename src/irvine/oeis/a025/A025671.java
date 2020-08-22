package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025671 Exponent of 7 (value of i) in n-th number of form 7^i*10^j.
 * @author Sean A. Irvine
 */
public class A025671 extends A025632 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (r.mod(7) == 0) {
      r = r.divide(7);
      ++c;
    }
    return Z.valueOf(c);
  }
}
