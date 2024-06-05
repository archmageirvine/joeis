package irvine.oeis.a032;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a159.A159289;
import irvine.oeis.memory.MemorySequence;

/**
 * A032199 "CIK" (necklace, indistinct, unlabeled) transform of 3,5,7...
 * @author Sean A. Irvine
 */
public class A032199 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A159289());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValueExact();
      sum = sum.add(mA.a(d - 1).multiply(Functions.PHI.l(mN / d)));
    }
    return sum.divide(mN).subtract(2);
  }
}
