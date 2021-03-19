package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045699 Numbers of the form p^2 + q^3, p,q prime.
 * @author Sean A. Irvine
 */
public class A045699 extends A045701 {

  @Override
  public Z next() {
    while (super.next().isZero()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
