package irvine.oeis.a060;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060658 Even numbers n such that sigma(x) = n has no solution.
 * @author Sean A. Irvine
 */
public class A060658 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (InverseSigma.countInverseSigma(mN).isZero()) {
        return mN;
      }
    }
  }
}
