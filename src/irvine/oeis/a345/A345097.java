package irvine.oeis.a345;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A345097 a(n) is the sum of the two preceding terms if n is odd or n &lt; 8, and of the two rightmost digits of a(n-1) if n is even, with a(0) = 0, a(1) = 1.
 * @author Georg Fischer
 */
public class A345097 extends Sequence0 {

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
    final Z result = ((mN & 1) == 1 || mN < 8) ? mB.add(mA) : mB.mod(Z.TEN).add(mB.divide(10).mod(Z.TEN));
    mA = mB;
    mB = result;
    return result;
  }
}
