package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025645 Exponent of <code>4</code> (value of <code>j)</code> in n-th number of form <code>3^i*4^j</code>.
 * @author Sean A. Irvine
 */
public class A025645 extends A025613 {

  @Override
  public Z next() {
    final Z r = super.next();
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 2);
  }
}
