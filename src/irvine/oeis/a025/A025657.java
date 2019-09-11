package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025657 Exponent of <code>6</code> (value of <code>j)</code> in n-th number of form <code>3^i*6^j</code>.
 * @author Sean A. Irvine
 */
public class A025657 extends A025614 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(6) == 0) {
      r = r.divide(6);
      ++c;
    }
    return Z.valueOf(c);
  }
}
