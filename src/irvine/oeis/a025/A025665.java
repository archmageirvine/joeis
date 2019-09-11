package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003594;

/**
 * A025665 Exponent of <code>7</code> (value of <code>j)</code> in n-th number of form <code>3^i*7^j</code>.
 * @author Sean A. Irvine
 */
public class A025665 extends A003594 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(7) == 0) {
      r = r.divide(7);
      ++c;
    }
    return Z.valueOf(c);
  }
}
