package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A048234 a(n) = T(2n-1,n), array T given by A048225.
 * @author Sean A. Irvine
 */
public class A048234 implements Sequence {

  private final MemorySequence mB = MemorySequence.cachedSequence(new A048224());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mB.a(2 * mN - 1).subtract(mB.a(mN - 1));
  }
}
