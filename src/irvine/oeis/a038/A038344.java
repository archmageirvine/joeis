package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038344 Numbers k such that phi(k) + sigma(k) is a prime.
 * @author Sean A. Irvine
 */
public class A038344 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().add(fs.phi()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
