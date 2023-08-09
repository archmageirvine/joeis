package irvine.oeis.a345;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A345095 a(n) is the sum of the two preceding terms if n is even, or of the two preceding digits if n is odd, with a(0) = 0, a(1) = 1.
 * @author Georg Fischer
 */
public class A345095 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mA;
    }
    if (mN == 1) {
      return mB;
    }
    final Z result = ((mN & 1) == 0 || mN < 8) ? mB.add(mA) : mB.mod(Z.TEN).add(mB.divide(10).mod(Z.TEN));
    mA = mB;
    mB = result;
    return result;
  }
}
