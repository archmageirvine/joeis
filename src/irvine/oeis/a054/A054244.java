package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003465;

/**
 * A054244 Number of partitions of n into distinct positive parts &lt;= n, with parts combined by IOR (inclusive or).
 * @author Sean A. Irvine
 */
public class A054244 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A003465());
  private long mN = 0;

  @Override
  public Z next() {
    return mA.a(Long.bitCount(++mN));
  }
}

