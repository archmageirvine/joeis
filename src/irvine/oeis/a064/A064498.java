package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064498 Numbers k such that the sum of unitary divisors of k^2 is a square.
 * @author Sean A. Irvine
 */
public class A064498 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).square().unitarySigma().isSquare()) {
        return mN;
      }
    }
  }
}
