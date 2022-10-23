package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055813 Primes arising in A064205.
 * @author Sean A. Irvine
 */
public class A055813 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z t = fs.sigma().add(fs.sigma0());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
