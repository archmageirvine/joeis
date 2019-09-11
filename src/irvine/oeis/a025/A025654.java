package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025654 Exponent of <code>5</code> (value of <code>i)</code> in n-th number of form <code>5^i*9^j</code>.
 * @author Sean A. Irvine
 */
public class A025654 extends A025624 {

  @Override
  public Z next() {
    Z r = super.next();
    long c = 0;
    while (r.mod(5) == 0) {
      r = r.divide(5);
      ++c;
    }
    return Z.valueOf(c);
  }
}
