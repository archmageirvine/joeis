package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033553 3-Kn\u00f6del numbers or D-numbers: numbers m &gt; 3 such that m | k^(m-2)-k for all k with gcd(k, m) = 1.
 * @author Sean A. Irvine
 */
public class A033553 extends Sequence1 {

  // After Max Alekseyev

  private long mN = 7;

  private boolean isA033553(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z pp : fs.toZArray()) {
      if ((n - 3) % Functions.PHI.z(pp.pow(fs.getExponent(pp))).longValueExact() != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (isA033553(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
