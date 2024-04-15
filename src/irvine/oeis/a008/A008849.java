package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008849 Numbers n such that the sum of divisors of n^3 is a square.
 * @author Sean A. Irvine
 */
public class A008849 extends Sequence1 {

  private Z mN = Z.ZERO;

  protected Z select(final Z x, final Z y2) {
    return x;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN)) {
        return Z.ONE;
      }
      final Z sum = Functions.SIGMA.z(mN.pow(3));
      if (sum.isSquare()) {
        return select(mN, sum);
      }
    }
  }
}
