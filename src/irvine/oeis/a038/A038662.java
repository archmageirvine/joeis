package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A038662 First gap of n in sequence A038593 (upper terms).
 * @author Sean A. Irvine
 */
public class A038662 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A038593());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int k = -1;
    while (true) {
      if (mA.a(++k).add(mN).equals(mA.a(k + 1))) {
        return mA.a(k + 1);
      }
    }
  }
}
