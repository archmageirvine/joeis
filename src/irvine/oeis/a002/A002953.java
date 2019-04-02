package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002953 Larger of unitary amicable pair.
 * @author Sean A. Irvine
 */
public class A002953 implements Sequence {

  private Z mN = Z.valueOf(113);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      final Z unitaryDivisorSum = fs.unitaryDivisorSum();
      if (unitaryDivisorSum.compareTo(mN) > 0) {
        final FactorSequence fs2 = Cheetah.factor(unitaryDivisorSum);
        if (fs2.unitaryDivisorSum().equals(mN)) {
          return unitaryDivisorSum;
        }
      }
    }
  }
}
