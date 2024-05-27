package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069900 Integer quotient of largest and smallest prime factors of n is greater than one.
 * @author Sean A. Irvine
 */
public class A069900 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.largestPrimeFactor().divide(fs.leastPrimeFactor()).compareTo(Z.ONE) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
