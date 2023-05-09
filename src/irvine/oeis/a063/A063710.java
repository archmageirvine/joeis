package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063710 Numbers k such that e(k) = s(k), where e(k) = eulerphi(sigma(k)+k) and s(n) = sigma(k-eulerphi(k)).
 * @author Sean A. Irvine
 */
public class A063710 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Euler.phi(fs.sigma().add(mN)).equals(Jaguar.factor(mN - fs.phi().longValueExact()).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
