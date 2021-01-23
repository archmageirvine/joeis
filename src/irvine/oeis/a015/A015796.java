package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015796 Numbers k such that phi(k) + 5 | sigma(k).
 * @author Sean A. Irvine
 */
public class A015796 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().mod(fs.phi().add(5)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
