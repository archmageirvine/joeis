package irvine.oeis.a014;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A014270 Number of trees on n nodes with forbidden limbs.
 * @author Sean A. Irvine
 */
public class A014270 extends A014267 {

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> t = RING.subtract(mB, RING.divide(RING.subtract(RING.pow(mB, 2, mN), mB.substitutePower(2, mN)), Z.TWO));
    return t.coeff(mN).add(mN == 9 || mN == 11 ? 1 : 0);
  }
}

