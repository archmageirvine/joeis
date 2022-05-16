package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015799 phi(n) + 8 | sigma(n).
 * @author Sean A. Irvine
 */
public class A015799 implements Sequence {

  private long mN = 21;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(8)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
