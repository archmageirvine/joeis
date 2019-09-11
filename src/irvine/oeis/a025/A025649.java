package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025649 Exponent of <code>4</code> (value of <code>i)</code> in n-th number of form <code>4^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025649 extends A025621 {

  @Override
  public Z next() {
    Z r = super.next();
    while (r.mod(10) == 0) {
      r = r.divide(10);
    }
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 2);
  }
}
