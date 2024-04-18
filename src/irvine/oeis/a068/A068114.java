package irvine.oeis.a068;

import java.util.HashSet;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.factorial.BinarySplitFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068114 Integers of the form phi(n!)/phi(n)!.
 * @author Sean A. Irvine
 */
public class A068114 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final FactorSequence mFactorSequence = new FactorSequence();
  private final HashSet<Z> mSeen = new HashSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mFactorSequence.add(++mN, FactorSequence.UNKNOWN);
      mFactor.factor(mFactorSequence);
      final Z t = new BinarySplitFactorial().factorial(Functions.PHI.z(mN).intValueExact());
      final Z f = mFactorSequence.phi();
      final Z[] qr = f.divideAndRemainder(t);
      if (qr[1].isZero() && mSeen.add(qr[0])) {
        return qr[0];
      }
    }
  }
}
