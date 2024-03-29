package irvine.oeis.a060;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060657 Odd values of the sum-of-divisors function sigma (A000203) (without repetitions).
 * @author Sean A. Irvine
 */
public class A060657 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!InverseSigma.countInverseSigma(mN).isZero()) {
        return mN;
      }
    }
  }
}
