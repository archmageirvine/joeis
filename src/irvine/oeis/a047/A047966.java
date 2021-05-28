package irvine.oeis.a047;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000009;

/**
 * A047966 a(n) = Sum_{ d divides n } q(d), where q(d) = A000009 = number of partitions of d into distinct parts.
 * @author Sean A. Irvine
 */
public class A047966 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000009());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(mA.a(d.intValue()));
    }
    return sum;
  }
}
