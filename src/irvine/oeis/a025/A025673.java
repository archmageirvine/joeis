package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025673 Exponent of <code>8</code> (value of <code>j)</code> in n-th number of form <code>5^i*8^j</code>.
 * @author Sean A. Irvine
 */
public class A025673 extends A025623 {

  @Override
  public Z next() {
    final Z r = super.next();
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 3);
  }
}
