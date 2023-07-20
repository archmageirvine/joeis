package irvine.oeis.a047;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000009;

/**
 * A047966 a(n) = Sum_{ d divides n } q(d), where q(d) = A000009 = number of partitions of d into distinct parts.
 * @author Sean A. Irvine
 */
public class A047966 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000009());
  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, mA::a);
  }
}
