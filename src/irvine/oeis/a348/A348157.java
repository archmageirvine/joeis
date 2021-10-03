package irvine.oeis.a348;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;

/**
 * A348157.
 * @author Sean A. Irvine
 */
public class A348157 implements Sequence {

  private final MemorySequence mSigma0 = MemorySequence.cachedSequence(new A000005());
  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    if (n == 1) {
      return m == 1 ? Z.ONE : Z.ZERO;
    }
    return mSigma0.a(n - 1).subtract(2).multiply(mSigma0.a(m - 1)).add(1).divide2().add(1);
  }

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return t(mN - mM + 1, mM);
  }
}
