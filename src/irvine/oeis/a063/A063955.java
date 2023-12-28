package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063955 Sum of the unitary prime divisors (A056169, A056171) of n!.
 * @author Sean A. Irvine
 */
public class A063955 extends Sequence1 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mFactorSequence.merge(Jaguar.factor(mN));
    }
    Z sum = Z.ZERO;
    for (final Z p : mFactorSequence.toZArray()) {
      if (mFactorSequence.getExponent(p) == 1) {
        sum = sum.add(p);
      }
    }
    return sum;
  }
}

