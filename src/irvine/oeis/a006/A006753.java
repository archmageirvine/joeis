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

  protected boolean is(final Z n) {
    if (n.isProbablePrime()) {
      return false;
    }
    final long d = Functions.DIGIT_SUM.l(n);
    final FactorSequence fs = Jaguar.factor(n);
    long s = 0;
    for (final Z p : fs.toZArray()) {
      s += Functions.DIGIT_SUM.l(p) * fs.getExponent(p);
      if (s * multiplier() > d) {
        break;
      }
    }
    return multiplier() * s == d;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}

