package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025648 Exponent of 4 (value of i) in n-th number of form 4^i*7^j.
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
