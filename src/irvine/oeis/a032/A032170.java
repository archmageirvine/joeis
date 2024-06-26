package irvine.oeis.a032;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004146;
import irvine.oeis.memory.MemorySequence;

/**
 * A032170 "CHK" (necklace, identity, unlabeled) transform of 1, 2, 3, 4, ...
 * @author Sean A. Irvine
 */
public class A032170 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A004146());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int dd = d.intValue();
      s = s.add(mA.a(dd).multiply(Functions.MOBIUS.i(mN / dd)));
    }
    return s.divide(mN);
  }
}
