package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067885 Products of exactly 6 distinct primes.
 * @author Sean A. Irvine
 */
public class A067885 extends Sequence1 {

  private long mN = 30029;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() == 6 && fs.omega() == 6) {
        return Z.valueOf(mN);
      }
    }
  }
}
