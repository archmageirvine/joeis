package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025655 Exponent of <code>5</code> (value of <code>i)</code> in n-th number of form <code>5^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025655 extends A025625 {

  @Override
  public Z next() {
    Z r = super.next();
    while (r.mod(10) == 0) {
      r = r.divide(10);
    }
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(5);
      ++c;
    }
    return Z.valueOf(c);
  }
}
