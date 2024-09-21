package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072278 Numbers n such that phi(n) is the sum of the first k divisors of n for some k.
 * @author Sean A. Irvine
 */
public class A072278 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z phi = fs.phi();
      Z sum = Z.ZERO;
      for (final Z d : fs.divisorsSorted()) {
        sum = sum.add(d);
        final int c = sum.compareTo(phi);
        if (c == 0) {
          return Z.valueOf(mN);
        }
        if (c > 0) {
          break;
        }
      }
    }
  }
}
