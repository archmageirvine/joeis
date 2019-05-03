package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005665 Tower of Hanoi with 3 pegs and cyclic moves only (clockwise).
 * @author Sean A. Irvine
 */
public class A005665 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
    } else {
      final Z t = mA.add(mB).multiply2().add(3);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

