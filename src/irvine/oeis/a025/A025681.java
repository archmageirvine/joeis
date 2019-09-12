package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025681 Exponent of <code>9</code> (value of <code>j)</code> in n-th number of form <code>7^i*9^j</code>.
 * @author Sean A. Irvine
 */
public class A025681 extends A025631 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(9) == 0) {
      r = r.divide(9);
      ++c;
    }
    return Z.valueOf(c);
  }
}
