package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025641 Exponent of <code>3</code> (value of <code>i)</code> in n-th number of form <code>3^i*6^j</code>.
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
