package irvine.oeis.a032;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004146;

/**
 * A032198 "CIK" <code>(necklace</code>, indistinct, unlabeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032198 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A004146());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValueExact();
      sum = sum.add(mA.a(d).multiply(LongUtils.phi(mN / d)));
    }
    return sum.divide(mN);
  }
}
