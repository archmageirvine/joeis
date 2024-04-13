package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058627 Numbers n such that phi(n) = product of the digits of n.
 * @author Sean A. Irvine
 */
public class A058627 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z prod = Functions.DIGIT_PRODUCT.z(mN);
      if (!prod.isZero() && prod.equals(Euler.phi(mN))) {
        return mN;
      }
    }
  }
}
