package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020492 Balanced numbers: numbers k such that phi(k) (A000010) divides sigma(k) (A000203).
 * @author Sean A. Irvine
 */
public class A020492 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
