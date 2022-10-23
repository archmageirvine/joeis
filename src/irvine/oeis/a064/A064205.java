package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064205 Numbers k such that sigma(k) + tau(k) is a prime.
 * @author Sean A. Irvine
 */
public class A064205 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().add(fs.sigma0()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
