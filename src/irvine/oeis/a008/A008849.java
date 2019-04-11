package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008849 Numbers n such that the sum of divisors of <code>n^3</code> is a square.
 * @author Sean A. Irvine
 */
public class A008849 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN)) {
        return Z.ONE;
      }
      final Z sum = Cheetah.factor(mN).pow(3).sigma();
      if (Z.ZERO.equals(sum.sqrtAndRemainder()[1])) {
        return mN;
      }
    }
  }
}
