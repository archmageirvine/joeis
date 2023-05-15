package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063795 Numbers k such that usigma(k) = phi(k)*omega(k), where omega(k) is the number of distinct prime divisors of k.
 * @author Sean A. Irvine
 */
public class A063795 extends Sequence1 {

  private long mN = 34;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.unitarySigma().equals(fs.phi().multiply(fs.omega()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
