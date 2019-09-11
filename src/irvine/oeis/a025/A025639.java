package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025639 Exponent of <code>2</code> (value of <code>i)</code> in n-th number of form <code>2^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025639 extends A025612 {

  @Override
  public Z next() {
    final Z r = super.next();
    Z t = r.makeOdd();
    long c = r.auxiliary();
    while (!Z.ONE.equals(t)) {
      t = t.divide(5);
      --c;
    }
    return Z.valueOf(c);
  }
}
