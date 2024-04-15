package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008850 Numbers n such that sum of divisors of n^2 is a cube.
 * @author Sean A. Irvine
 */
public class A008850 extends Sequence1 {

  private Z mN = Z.ZERO;

  protected Z select(final Z x, final Z y) {
    return x;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN)) {
        return Z.ONE;
      }
      final Z sum = Functions.SIGMA.z(mN.square());
      final Z r = sum.root(3);
      if (sum.auxiliary() == 1) {
        return select(mN, r);
      }
    }
  }
}
