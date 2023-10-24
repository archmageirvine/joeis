package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066509 a(n) is the first of a triple of consecutive integers, each the product of three distinct primes.
 * @author Sean A. Irvine
 */
public class A066509 extends Sequence1 {

  private long mN = 1308;

  private boolean is3(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.omega() == 3 && fs.maxExponent() == 1;
  }

  @Override
  public Z next() {
    while (true) {
      if (is3(++mN) && is3(mN + 1) && is3(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}

