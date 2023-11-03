package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066679 Numbers n such that sigma(n) is congruent to n mod phi(n).
 * @author Sean A. Irvine
 */
public class A066679 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final long phi = fs.phi().longValueExact();
      if (fs.sigma().mod(phi) == mN % phi) {
        return Z.valueOf(mN);
      }
    }
  }
}
