package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023847 Sum of exponents in prime-power factorization of binomial(5n, 2n).
 * @author Sean A. Irvine
 */
public class A023847 implements Sequence {

  private long mN = -1;

  protected long binomialOmega(final long n, final long m) {
    final FactorSequence fsTop = new FactorSequence();
    for (long k = m + 1; k <= n; ++k) {
      fsTop.add(k, FactorSequence.UNKNOWN, 1);
    }
    final FactorSequence fsBot = new FactorSequence();
    for (long k = 2; k <= n - m; ++k) {
      fsBot.add(k, FactorSequence.UNKNOWN, 1);
    }
    Jaguar.factor(fsTop);
    Jaguar.factor(fsBot);
    return fsTop.bigOmega() - fsBot.bigOmega();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(binomialOmega(5 * mN, 2 * mN));
  }
}

