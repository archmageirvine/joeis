package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025676 Exponent of <code>8</code> (value of <code>i)</code> in n-th number of form <code>8^i*9^j</code>.
 * @author Sean A. Irvine
 */
public class A025676 extends A025633 {

  @Override
  public Z next() {
    final Z r = super.next();
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 3);
  }
}
