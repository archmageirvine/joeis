package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015809 Odd numbers k such that phi(k) | sigma_3(k).
 * @author Sean A. Irvine
 */
public class A015809 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma(3).mod(fs.phi()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
