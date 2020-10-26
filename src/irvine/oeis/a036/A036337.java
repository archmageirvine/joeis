package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036337.
 * @author Sean A. Irvine
 */
public class A036337 implements Sequence {

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
    mLimit = mLimit.multiply(10);
    Z s = mLimit;
    while (true) {
      s = s.subtract(1);
      if (bigOmega(s) == mN) {
        return s;
      }
    }
  }
}
