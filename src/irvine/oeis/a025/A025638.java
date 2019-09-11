package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025638 Exponent of <code>2</code> (value of <code>i)</code> in n-th number of form <code>2^i*9^j</code>.
 * @author Sean A. Irvine
 */
public class A025638 extends A025611 {

  @Override
  public Z next() {
    final Z r = super.next();
    r.makeOdd();
    return Z.valueOf(r.auxiliary());
  }
}
