package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025682 Exponent of <code>9</code> (value of <code>j)</code> in n-th number of form <code>8^i*9^j</code>.
 * @author Sean A. Irvine
 */
public class A025682 extends A025633 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(9);
      ++c;
    }
    return Z.valueOf(c);
  }
}
