package irvine.oeis.a032;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a159.A159289;

/**
 * A032199 "CIK" (necklace, indistinct, unlabeled) transform of 3,5,7...
 * @author Sean A. Irvine
 */
public class A032199 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A159289());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValueExact();
      sum = sum.add(mA.a(d - 1).multiply(LongUtils.phi(mN / d)));
    }
    return sum.divide(mN).subtract(2);
  }
}
