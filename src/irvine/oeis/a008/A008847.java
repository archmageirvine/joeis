package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008847 Numbers k such that sum of divisors of k^2 is a square.
 * @author Sean A. Irvine
 */
public class A008847 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN)) {
        return Z.ONE;
      }
      final Z sum = Jaguar.factor(mN).square().sigma();
      if (sum.isSquare()) {
        return mN;
      }
    }
  }
}
