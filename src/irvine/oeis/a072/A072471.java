package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072471 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    } else if (mA.isZero()) {
      mA = Z.valueOf(25);
      return mA;
    } else {
      Z k = mA.sqrt();
      while (true) {
        k = k.add(1);
        if (mA.add(k.square()).isSquare()) {
          mA = k.square();
          return mA;
        }
      }
    }
  }
}

