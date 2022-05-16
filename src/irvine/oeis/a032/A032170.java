package irvine.oeis.a032;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004146;

/**
 * A032170 "CHK" (necklace, identity, unlabeled) transform of 1, 2, 3, 4, ...
 * @author Sean A. Irvine
 */
public class A032170 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A004146());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int dd = d.intValue();
      s = ZUtils.mobiusAdd(Mobius.mobius(mN / dd), s, mA.a(dd));
    }
    return s.divide(mN);
  }
}
