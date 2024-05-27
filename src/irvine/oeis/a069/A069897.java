package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069897 Integer quotient of the largest and the smallest prime factors of n, with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A069897 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.largestPrimeFactor().divide(fs.leastPrimeFactor());
  }
}
