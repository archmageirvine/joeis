package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055813 Primes arising in A064205.
 * @author Sean A. Irvine
 */
public class A055813 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z t = fs.sigma().add(fs.sigma0());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
