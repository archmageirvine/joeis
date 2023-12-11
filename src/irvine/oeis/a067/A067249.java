package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067249 Digits of sigma(n) end in phi(n).
 * @author Sean A. Irvine
 */
public class A067249 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().toString().endsWith(fs.phi().toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}

