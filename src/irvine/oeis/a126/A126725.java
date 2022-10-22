package irvine.oeis.a126;
// manually hygeom at 2022-08-06 19:54

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A126725 a(1)=0, a(2)=1; for n&gt;2, a(n) = C(n,2)*(1+a(n-2)).
 * @author Georg Fischer
 */
public class A126725 extends Sequence1 {

  private int mN = 0;
  private Z mA1 = Z.ZERO;
  private Z mA2 = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return mA1;
    } else if (mN == 2) {
      return mA2;
    } else {
      final Z result = Z.valueOf((mN - 1L) * mN / 2).multiply(mA1.add(1));
      mA1 = mA2;
      mA2 = result;
      return result;
    }
  }
}
