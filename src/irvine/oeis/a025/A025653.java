package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025653 Exponent of <code>5</code> (value of <code>i)</code> in n-th number of form <code>5^i*8^j</code>.
 * @author Sean A. Irvine
 */
public class A025653 extends A025623 {

  @Override
  public Z next() {
    Z r = super.next().makeOdd();
    long c = 0;
    while (!Z.ONE.equals(r)) {
      r = r.divide(5);
      ++c;
    }
    return Z.valueOf(c);
  }
}
