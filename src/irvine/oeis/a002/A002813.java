package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002813.
 * @author Sean A. Irvine
 */
public class A002813 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
    } else {
      final Z t = mA.square();
      mA = t.multiply(mA).subtract(t.multiply(3)).add(3);
    }
    return mA;
  }
}

