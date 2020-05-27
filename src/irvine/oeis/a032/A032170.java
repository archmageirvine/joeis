package irvine.oeis.a032;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004146;

/**
 * A032170 "CHK" <code>(necklace</code>, identity, unlabeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032170 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A004146());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      final int dd = d.intValue();
      s = s.add(mA.a(dd).multiply(Mobius.mobius(mN / dd)));
    }
    return s.divide(mN);
  }
}
