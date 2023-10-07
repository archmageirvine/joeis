package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A066286.
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

