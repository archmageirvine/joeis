package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067683 Phi(n)*sigma(n)+1 is prime.
 * @author Sean A. Irvine
 */
public class A067683 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().multiply(fs.sigma()).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
