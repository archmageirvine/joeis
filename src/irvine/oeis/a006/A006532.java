package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006532 Numbers whose sum of divisors is a square.
 * @author Sean A. Irvine
 */
public class A006532 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN)) {
        return Z.ONE;
      }
      final Z sum = Cheetah.factor(mN).sigma();
      if (sum.isSquare()) {
        return mN;
      }
    }
  }
}
