package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025661 Exponent of <code>6</code> (value of <code>i)</code> in n-th number of form <code>6^i*8^j</code>.
 * @author Sean A. Irvine
 */
public class A025661 extends A025627 {

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
