package irvine.oeis.a067;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067562 Odd values of k such that phi(k)! divides phi(k!) where phi(k) = A000010(k).
 * @author Sean A. Irvine
 */
public class A067562 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN > 1) {
        mFactorSequence.add(mN, FactorSequence.UNKNOWN);
        mFactorSequence.add(mN - 1, FactorSequence.UNKNOWN);
        mFactor.factor(mFactorSequence);
      }
      if (mFactorSequence.phi().mod(MemoryFactorial.SINGLETON.factorial(Euler.phi(mN))).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
