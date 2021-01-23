package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025643 Exponent of 3 (value of i) in n-th number of form 3^i*8^j.
 * @author Sean A. Irvine
 */
public class A025643 extends A025615 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(3);
      ++c;
    }
    return Z.valueOf(c);
  }
}
