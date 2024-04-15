package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006532 Numbers whose sum of divisors is a square.
 * @author Sean A. Irvine
 */
public class A006532 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN)) {
        return Z.ONE;
      }
      final Z sum = Functions.SIGMA.z(mN);
      if (sum.isSquare()) {
        return mN;
      }
    }
  }
}
