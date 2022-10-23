package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059661 Like A059459, but each term must be greater than the previous ones.
 * @author Sean A. Irvine
 */
public class A059661 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      int k = 0;
      while (true) {
        if (!mA.testBit(k)) {
          final Z t = mA.setBit(k);
          if (t.isProbablePrime()) {
            mA = t;
            break;
          }
        }
        ++k;
      }
    }
    return mA;
  }
}
