package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014281 Number of trees on n nodes with forbidden limbs.
 * @author Sean A. Irvine
 */
public class A014281 extends A014280 {

  @Override
  public Z next() {
    super.next();
    return RING.subtract(mB, RING.divide(RING.subtract(RING.pow(mB, 2, mN), mB.substitutePower(2, mN)), Z.TWO))
      .coeff(mN).add(mN == 5 || mN == 6 ? 1 : 0);
  }
}

