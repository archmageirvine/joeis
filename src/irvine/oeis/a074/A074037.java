package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074037 Sum of the composites between the smallest prime factor of n and the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074037 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z sum = Z.ZERO;
    for (Z k = fs.leastPrimeFactor().add(1); k.compareTo(fs.largestPrimeFactor()) < 0; k = k.add(1)) {
      if (!k.isProbablePrime()) {
        sum = sum.add(k);
      }
    }
    return sum;
  }
}
