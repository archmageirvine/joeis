package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004979;

/**
 * A048221 a(n)=T(2n-1,n), array T given by A048212.
 * @author Sean A. Irvine
 */
public class A048221 implements Sequence {

  private final MemorySequence mB = MemorySequence.cachedSequence(new A004979());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return mB.a(2 * mN - 1).subtract(mB.a(mN - 1));
  }
}
