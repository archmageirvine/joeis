package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A074254 Composite numbers equal to the sum of the squarefree numbers from their smallest prime factor to their largest prime factor.
 * @author Sean A. Irvine
 */
public class A074254 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      Z sum = Z.ZERO;
      for (long k = fs.leastPrimeFactor().longValue(); k <= fs.largestPrimeFactor().longValue(); ++k) {
        if (Predicates.SQUARE_FREE.is(k)) {
          sum = sum.add(k);
        }
      }
      if (sum.equals(c)) {
        return c;
      }
    }
  }
}
