package irvine.oeis.a032;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004146;

/**
 * A032198 "CIK" (necklace, indistinct, unlabeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032198 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A004146());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValueExact();
      sum = sum.add(mA.a(d).multiply(Euler.phiAsLong(mN / d)));
    }
    return sum.divide(mN);
  }
}
