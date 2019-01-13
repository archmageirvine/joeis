package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002814.
 * @author Sean A. Irvine
 */
public class A002814 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.TWO;
    } else {
      final Z t = mA.square();
      mA = t.multiply(mA).add(t.multiply(3)).subtract(3);
    }
    return mA;
  }
}

