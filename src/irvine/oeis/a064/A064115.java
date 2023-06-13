package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064115 Numbers k such that k and k+1 have the same sum of non-unitary divisors (A048146), for A048146(k) &gt; 0.
 * @author Sean A. Irvine
 */
public class A064115 extends Sequence1 {

  protected long mN = 187;

  private Z nud(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma().subtract(fs.unitarySigma());
  }

  @Override
  public Z next() {
    while (true) {
      final Z nud = nud(++mN);
      if (!nud.isZero() && nud.equals(nud(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}

