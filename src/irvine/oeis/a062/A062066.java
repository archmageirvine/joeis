package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062066 a(1) = 2; a(n) is the smallest prime &gt; a(n-1) such that a(n) + a(n-1) is a cube.
 * @author Sean A. Irvine
 */
public class A062066 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      Z root = mA.multiply2().root(3);
      while (true) {
        root = root.add(1);
        final Z t = root.pow(3).subtract(mA);
        if (t.isProbablePrime()) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}

