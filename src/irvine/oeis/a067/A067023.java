package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067023 Sigma-crowded numbers: n such that d(n)/sigma(n) is larger than d(m)/sigma(m) for all m &gt; n.
 * @author Sean A. Irvine
 */
public class A067023 extends Sequence1 {

  private long mN = 0;

  private boolean isCrowded(final long n) {
    final FactorSequence fs0 = Jaguar.factor(n);
    final Z s0 = fs0.sigma0();
    final Z s = fs0.sigma();
    for (long m = n + 1; m <= 2 * n; ++m) {
      final FactorSequence fs1 = Jaguar.factor(m);
      final Z t0 = fs1.sigma0();
      final Z t = fs1.sigma();
      if (t0.multiply(s).compareTo(s0.multiply(t)) >= 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isCrowded(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
