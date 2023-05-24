package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063891 Numbers k such that nusigma(usigma(k)) = 2k, where usigma(k) is the sum of unitary divisors of k (A034448) and nusigma(k) is the sum of non-unitary divisors of k (A048146).
 * @author Sean A. Irvine
 */
public class A063891 extends Sequence1 {

  private long mN = 1630;

  private Z z(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma().subtract(fs.unitarySigma());
  }

  @Override
  public Z next() {
    while (true) {
      if (z(Jaguar.factor(++mN).unitarySigma()).equals(Z.valueOf(2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
