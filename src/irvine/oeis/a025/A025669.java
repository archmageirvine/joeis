package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a036.A036566;

/**
 * A025669 Exponent of <code>7</code> (value of <code>i)</code> in n-th number of form <code>7^i*8^j</code>.
 * @author Sean A. Irvine
 */
public class A025669 extends A036566 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (r.mod(7) == 0) {
      r = r.divide(7);
      ++c;
    }
    return Z.valueOf(c);
  }
}
