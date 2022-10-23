package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002953 Larger of unitary amicable pair.
 * @author Sean A. Irvine
 */
public class A002953 extends Sequence1 {

  private Z mN = Z.valueOf(113);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      final Z unitaryDivisorSum = fs.unitaryDivisorSum();
      if (unitaryDivisorSum.compareTo(mN) > 0) {
        final FactorSequence fs2 = Jaguar.factor(unitaryDivisorSum);
        if (fs2.unitaryDivisorSum().equals(mN)) {
          return unitaryDivisorSum;
        }
      }
    }
  }
}
