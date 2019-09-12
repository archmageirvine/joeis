package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025689 Exponent of <code>10</code> (value of <code>j)</code> in n-th number of form <code>7^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025689 extends A025632 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(10) == 0) {
      r = r.divide(10);
      ++c;
    }
    return Z.valueOf(c);
  }
}
