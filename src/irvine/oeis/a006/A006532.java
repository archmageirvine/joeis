package irvine.oeis.a006;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006532 Numbers n such that sum of divisors of n is a square.
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
      if (Z.ZERO.equals(sum.sqrtAndRemainder()[1])) {
        return mN;
      }
    }
  }
}
