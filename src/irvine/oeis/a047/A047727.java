package irvine.oeis.a047;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047727 Average divisor is an integer (A003601) and the number is refactorable (A033950).
 * @author Sean A. Irvine
 */
public class A047727 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      final Z s0 = fs.sigma0();
      if (fs.sigma().mod(s0).isZero() && mN.mod(s0).isZero()) {
        return mN;
      }
    }
  }
}
