package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A045514 Number of conjugacy classes of elements of order n in E_8(C).
 * @author Sean A. Irvine
 */
public class A045514 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A045513());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mA.a(d).multiply(Mobius.mobius(mN / d)));
    }
    return sum;
  }
}
