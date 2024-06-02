package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070161 Nonprime numbers n such that q=phi(n)/(sigma(n)-n-1) is an integer and n is not a prime square.
 * @author Sean A. Irvine
 */
public class A070161 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.omega() > 1 || fs.bigOmega() <= 1) {
        final Z chowla = fs.sigma().subtract(mN + 1);
        if (!chowla.isZero() && fs.phi().mod(chowla).isZero()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
