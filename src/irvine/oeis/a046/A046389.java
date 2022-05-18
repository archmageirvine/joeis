package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046389 Products of exactly three distinct odd primes.
 * @author Sean A. Irvine
 */
public class A046389 implements Sequence {

  private long mN = 103;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.bigOmega() == 3 && fs.omega() == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
