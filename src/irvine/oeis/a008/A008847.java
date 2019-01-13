package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008847.
 * @author Sean A. Irvine
 */
public class A008847 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN)) {
        return Z.ONE;
      }
      final Z sum = Cheetah.factor(mN).square().sigma();
      if (Z.ZERO.equals(sum.sqrtAndRemainder()[1])) {
        return mN;
      }
    }
  }
}
