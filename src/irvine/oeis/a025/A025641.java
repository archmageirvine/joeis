package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025641 Exponent of 3 (value of i) in n-th number of form 3^i*6^j.
 * @author Sean A. Irvine
 */
public class A025641 extends A025614 {

  @Override
  public Z next() {
    final Z t = super.next();
    Z r = t.makeOdd();
    long c = -t.auxiliary();
    while (!Z.ONE.equals(r)) {
      r = r.divide(3);
      ++c;
    }
    return Z.valueOf(c);
  }
}
