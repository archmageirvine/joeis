package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002952 Smaller of unitary amicable pair.
 * @author Sean A. Irvine
 */
public class A002952 extends Sequence1 {

  private Z mN = Z.valueOf(113);

  protected Z select(final Z n, final Z a) {
    return n;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      final Z unitaryDivisorSum = fs.unitaryDivisorSum();
      if (unitaryDivisorSum.compareTo(mN) > 0) {
        final FactorSequence fs2 = Jaguar.factor(unitaryDivisorSum);
        if (fs2.unitaryDivisorSum().equals(mN)) {
          return select(mN, unitaryDivisorSum);
        }
      }
    }
  }
}
