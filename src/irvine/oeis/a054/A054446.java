package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000129;
import irvine.oeis.a037.A037027;

/**
 * A054446 Triangle of partial row sums of triangle A037027(n,m), n &gt;= m &gt;= 0 (Fibonacci convolution triangle).
 * @author Sean A. Irvine
 */
public class A054446 extends A037027 {

  private final Sequence mPell = new SkipSequence(new A000129(), 1);
  private long mN = -1;
  private long mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = mPell.next();
    } else {
      mT = mT.subtract(t(mN, mM - 1));
    }
    return mT;
  }
}
