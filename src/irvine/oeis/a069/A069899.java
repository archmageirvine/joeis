package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069899 Integer quotient of largest and smallest prime factors of n is 1.
 * @author Sean A. Irvine
 */
public class A069899 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.largestPrimeFactor().divide(fs.leastPrimeFactor()).equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
