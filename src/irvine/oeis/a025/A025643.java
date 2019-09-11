package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025643 Exponent of <code>3</code> (value of <code>i)</code> in n-th number of form <code>3^i*8^j</code>.
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
