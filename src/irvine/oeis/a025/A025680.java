package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025680 Exponent of <code>9</code> (value of <code>j)</code> in n-th number of form <code>6^i*9^j</code>.
 * @author Sean A. Irvine
 */
public class A025680 extends A025628 {

  @Override
  public Z next() {
    Z r = super.next();
    while (r.mod(6) == 0) {
      r = r.divide(6);
    }
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(9);
      ++c;
    }
    return Z.valueOf(c);
  }
}
