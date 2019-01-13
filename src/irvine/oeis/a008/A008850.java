package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008850.
 * @author Sean A. Irvine
 */
public class A008850 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ONE.equals(mN)) {
        return Z.ONE;
      }
      final Z sum = Cheetah.factor(mN).square().sigma();
      sum.root(3); // sets auxiliary
      if (sum.auxiliary() == 1) {
        return mN;
      }
    }
  }
}
