package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070160 Nonprime numbers k such that phi(k)/(sigma(k) - k - 1) is an integer.
 * @author Sean A. Irvine
 */
public class A070160 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z chowla = fs.sigma().subtract(mN + 1);
      if (!chowla.isZero() && fs.phi().mod(chowla).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
