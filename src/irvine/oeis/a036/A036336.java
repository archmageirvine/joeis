package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036336 Smallest positive integer with n digits and exactly n prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036336 extends Sequence1 {

  private final PrimeDivision mPrimeDivision = new PrimeDivision(1000000);
  private long mN = 0;
  private Z mLimit = Z.ONE;

  private long bigOmega(final Z s) {
    // This uses a special factoring engine because most of these are easy to factor.
    final FactorSequence fs = new FactorSequence(s);
    mPrimeDivision.factor(fs);
    if (fs.isComplete()) {
      return fs.bigOmega();
    }
    return Jaguar.factor(s).bigOmega();
  }

  @Override
  public Z next() {
    ++mN;
    Z s = mLimit;
    mLimit = mLimit.multiply(10);
    while (!s.equals(mLimit)) {
      if (bigOmega(s) == mN) {
        return s;
      }
      s = s.add(1);
    }
    throw new RuntimeException();
  }
}
