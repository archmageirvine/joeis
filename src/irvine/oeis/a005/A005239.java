package irvine.oeis.a005;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005239 Irregular triangle of Section I numbers. Row n contains numbers k with <code>2^n &lt; k &lt; 2^(n+1)</code> and <code>phi^n(k) = 2</code>, where <code>phi^n</code> means n iterations of Euler's totient function.
 * @author Sean A. Irvine
 */
public class A005239 implements Sequence {

  private int mN = 0;
  private Z mK = Z.ONE;
  private Z mLim = Z.TWO;

  private Z interatedPhi(final Z k, final int n) {
    return n == 0 ? k : Euler.phi(interatedPhi(k, n - 1));
  }

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(2);
      if (mK.compareTo(mLim) >= 0) {
        mLim = mLim.multiply2();
        ++mN;
      }
      if (Z.TWO.equals(interatedPhi(mK, mN))) {
        return mK;
      }
    }
  }
}
