package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A038661 First gap of n in sequence A038593 (lower terms).
 * @author Sean A. Irvine
 */
public class A038661 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A038593());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = -1;
    while (true) {
      if (mA.a(++k).add(mN).equals(mA.a(k + 1))) {
        return mA.a(k);
      }
    }
  }
}
