package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006753 Smith (or joke) numbers: composite numbers k such that sum of digits of k = sum of digits of prime factors of k (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A006753 extends Sequence1 {

  private Z mN = Z.THREE;

  protected long multiplier() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isProbablePrime()) {
        final long d = Functions.DIGIT_SUM.l(mN);
        final FactorSequence fs = Jaguar.factor(mN);
        long s = 0;
        for (final Z p : fs.toZArray()) {
          s += Functions.DIGIT_SUM.l(p) * fs.getExponent(p);
        }
        if (multiplier() * s == d) {
          return mN;
        }
      }
    }
  }
}

