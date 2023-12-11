package irvine.oeis.a057;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001055;
import irvine.oeis.memory.MemorySequence;

/**
 * A057567 Number of partitions of n where the product of parts divides n.
 * @author Sean A. Irvine
 */
public class A057567 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A001055());
  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> mA.a(d - 1));
  }
}

