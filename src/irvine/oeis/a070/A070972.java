package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070964.
 * @author Sean A. Irvine
 */
public class A070972 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    int max = 0;
    int cnt = 0;
    int k = mA.bitLength();
    while (--k >= 0) {
      if (mA.testBit(k)) {
        ++cnt;
      } else {
        if (cnt > max) {
          max = cnt;
        }
        cnt = 0;
      }
    }
    return Z.valueOf(Math.max(max, cnt));
  }
}
