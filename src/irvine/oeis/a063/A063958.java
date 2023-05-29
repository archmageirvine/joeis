package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063958 Sum of the non-unitary prime factors of n: sum of those prime factors for which the exponent exceeds 1.
 * @author Sean A. Irvine
 */
public class A063958 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) > 1) {
        sum = sum.add(p);
      }
    }
    return sum;
  }
}

