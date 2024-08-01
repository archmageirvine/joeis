package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063960 Sum of non-unitary prime divisors of n!: sum of those prime divisors for which the exponent in the prime factorization exceeds 1.
 * @author Sean A. Irvine
 */
public class A063960 extends Sequence1 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mFactorSequence.merge(Jaguar.factor(mN));
    }
    Z sum = Z.ZERO;
    for (final Z p : mFactorSequence.toZArray()) {
      if (mFactorSequence.getExponent(p) > 1) {
        sum = sum.add(p);
      }
    }
    return sum;
  }
}

