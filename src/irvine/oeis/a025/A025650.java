package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025650 Exponent of <code>5</code> (value of <code>j)</code> in n-th number of form <code>4^i*5^j</code>.
 * @author Sean A. Irvine
 */
public class A025650 extends A025617 {

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
