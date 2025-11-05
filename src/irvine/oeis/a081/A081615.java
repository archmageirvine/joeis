package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081615 Subsequence of A005428 where state = 2.
 * @author Sean A. Irvine
 */
public class A081615 extends Sequence0 {

  // After David A. Corneth and Petros Hadjicostas

  private Z mWo = Z.TWO;
  private Z mGo = null;

  @Override
  public Z next() {
    if (mGo == null) {
      mGo = Z.ZERO;
      return Z.ONE;
    }
    if (mGo.isZero()) {
      mGo = Z.TWO;
      return Z.TWO;
    }
    while (true) {
      final long c = mWo.mod(2);
      final Z wn = mWo.multiply(3).divide2().add(Z.TWO.subtract(mGo).multiply(c));
      final Z gn = Z.NEG_ONE.pow(c).multiply(mGo).add(3 * c);
      mWo = wn;
      mGo = gn;
      if (Z.TWO.equals(mGo)) {
        return mWo;
      }
    }
  }
}
