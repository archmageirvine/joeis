package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025648 Exponent of <code>4</code> (value of <code>i)</code> in n-th number of form <code>4^i*7^j</code>.
 * @author Sean A. Irvine
 */
public class A025648 extends A025619 {

  @Override
  public Z next() {
    final Z r = super.next();
    r.makeOdd();
    return Z.valueOf(r.auxiliary() / 2);
  }
}
