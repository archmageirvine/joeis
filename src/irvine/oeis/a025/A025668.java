package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025668 Exponent of <code>7</code> (value of <code>j)</code> in n-th number of form <code>6^i*7^j</code>.
 * @author Sean A. Irvine
 */
public class A025668 extends A025626 {

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
