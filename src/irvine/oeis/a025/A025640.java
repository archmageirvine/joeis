package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025640 Exponent of <code>3</code> (value of <code>i)</code> in n-th number of form <code>3^i*4^j</code>.
 * @author Sean A. Irvine
 */
public class A025640 extends A025613 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(3) == 0) {
      r = r.divide(3);
      ++c;
    }
    return Z.valueOf(c);
  }
}
