package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067709 Numbers k such that phi(2*sigma(k)) = 2*sigma(phi(k)).
 * @author Sean A. Irvine
 */
public class A067709 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Euler.phi(fs.sigma().multiply2()).equals(Jaguar.factor(fs.phi()).sigma().multiply2())) {
        return Z.valueOf(mN);
      }
    }
  }
}
