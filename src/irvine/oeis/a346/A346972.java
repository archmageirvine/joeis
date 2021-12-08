package irvine.oeis.a346;
// manually holink/holos at 2021-12-08 21:32

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A346972 a(1)=1, a(2)=4, a(n) = (n*a(n-1) - (n-1)*a(n-2)) mod (n+1).
 * @author Georg Fischer
 */
public class A346972 implements Sequence {

  private int mN = 0;
  private Z mA_1 = Z.FOUR;
  private Z mA_2 = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return mA_2;
    } else if (mN == 2) {
      return mA_1;
    }
    final Z result = mA_1.multiply(mN).subtract(mA_2.multiply(mN - 1)).mod(Z.valueOf(mN + 1));
    mA_2 = mA_1;
    mA_1 = result;
    return result;
  }
}
