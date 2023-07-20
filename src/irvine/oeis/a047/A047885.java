package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000720;

/**
 * A047885 Array a(m,n) = pi(m+n) - pi(m) - pi(n) read by antidiagonals, where pi() = A000720 (m,n &gt;= 0).
 * @author Sean A. Irvine
 */
public class A047885 extends Sequence0 {

  private final MemorySequence mPi = MemorySequence.cachedSequence(new PrependSequence(new A000720(), 0));
  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    return mPi.a(n + m).subtract(mPi.a(m)).subtract(mPi.a(n));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

