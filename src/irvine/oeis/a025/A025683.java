package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025683 Exponent of 9 (value of i) in n-th number of form 9^i*10^j.
 * @author Sean A. Irvine
 */
public class A025683 extends A025635 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (r.mod(9) == 0) {
      r = r.divide(9);
      ++c;
    }
    return Z.valueOf(c);
  }
}
