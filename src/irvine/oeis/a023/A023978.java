package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A023978 Sum of exponents in prime-power factorization of multinomial coefficient M(3n; n,n,n).
 * @author Sean A. Irvine
 */
public class A023978 extends Sequence0 {

  private long mN = -1;

  protected long multinomialOmega(final long n, final long... m) {
    final FactorSequence fsTop = new FactorSequence();
    for (long k = 2; k <= n; ++k) {
      fsTop.add(k, FactorSequence.UNKNOWN, 1);
    }
    final FactorSequence fsBot = new FactorSequence();
    for (final long t : m) {
      for (long k = 2; k <= t; ++k) {
        fsBot.add(k, FactorSequence.UNKNOWN, 1);
      }
    }
    Jaguar.factor(fsTop);
    Jaguar.factor(fsBot);
    return fsTop.bigOmega() - fsBot.bigOmega();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(3 * mN, mN, mN, mN));
  }
}

