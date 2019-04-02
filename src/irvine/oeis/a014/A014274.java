package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014274 Number of trees on n nodes with forbidden limbs.
 * @author Sean A. Irvine
 */
public class A014274 extends A014273 {

  @Override
  public Z next() {
    super.next();
    return RING.subtract(mB, RING.pow(mB, 2, mN)).coeff(mN);
  }
}

