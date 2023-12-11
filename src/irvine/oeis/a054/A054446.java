package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000129;
import irvine.oeis.a037.A037027;
import irvine.oeis.memory.MemorySequence;

/**
 * A054446 Triangle of partial row sums of triangle A037027(n,m), n &gt;= m &gt;= 0 (Fibonacci convolution triangle).
 * @author Sean A. Irvine
 */
public class A054446 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A037027());
  private final Sequence mPell = new A000129().skip(1);
  private int mN = -1;
  private int mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = mPell.next();
    } else {
      mT = mT.subtract(mA.a(mN * (mN + 1) / 2 + mM - 1));
    }
    return mT;
  }
}
