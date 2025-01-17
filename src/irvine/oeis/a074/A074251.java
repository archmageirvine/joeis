package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074251 Sum of the squarefree numbers from the smallest prime factor of n to the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074251 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    Z sum = Z.ZERO;
    for (long k = fs.leastPrimeFactor().longValue(); k <= fs.largestPrimeFactor().longValue(); ++k) {
      if (Predicates.SQUARE_FREE.is(k)) {
        sum = sum.add(k);
      }
    }
    return sum;
  }
}
