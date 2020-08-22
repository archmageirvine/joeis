package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025653 Exponent of 5 (value of i) in n-th number of form 5^i*8^j.
 * @author Sean A. Irvine
 */
public class A025653 extends A025623 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(5);
      ++c;
    }
    return Z.valueOf(c);
  }
}
