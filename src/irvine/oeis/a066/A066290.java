package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A066290 Numbers m such that DivisorSigma(4*k-2, m) mod m = 0 holds presumably for all k; that is, (4k-2)-power-sums of divisors of m are divisible by m for all k.
 * @author Sean A. Irvine
 */
public class A066290 extends Sequence1 implements Conjectural {

  private static final int MAX_K = 500;
  private long mN = 0;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (int k = 1; k <= MAX_K; ++k) {
      if (fs.sigma(4 * k - 2).mod(n) != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

