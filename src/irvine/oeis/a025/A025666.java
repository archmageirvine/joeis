package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025666 Exponent of 7 (value of j) in n-th number of form 4^i*7^j.
 * @author Sean A. Irvine
 */
public class A025666 extends A025619 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(7);
      ++c;
    }
    return Z.valueOf(c);
  }
}
