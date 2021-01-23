package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025678 Exponent of 9 (value of j) in n-th number of form 2^i*9^j.
 * @author Sean A. Irvine
 */
public class A025678 extends A025611 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(9);
      ++c;
    }
    return Z.valueOf(c);
  }
}
