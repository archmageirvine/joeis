package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054374 Discriminant of Hermite polynomials.
 * @author Sean A. Irvine
 */
public class A054374 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 2; k <= mN; ++k) {
      prod = prod.multiply(Z.valueOf(k).pow(k));
    }
    return prod.shiftLeft(3L * mN * (mN - 1) / 2);
  }
}

