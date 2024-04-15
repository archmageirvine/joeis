package irvine.oeis.a008;

import irvine.math.function.Functions;
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
      if (Functions.SIGMA.z(mN.square()).isSquare()) {
        return mN;
      }
    }
  }
}
