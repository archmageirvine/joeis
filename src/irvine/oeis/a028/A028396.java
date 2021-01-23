package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028396 Iterate the map in A006369 starting at 14.
 * @author Sean A. Irvine
 */
public class A028396 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(14);
    } else {
      final Z t = mA.multiply(4);
      final long r = mA.mod(3);
      if (r == 0) {
        mA = mA.multiply2().divide(3);
      } else if (r == 1) {
        mA = t.divide(3);
      } else {
        mA = t.add(1).divide(3);
      }
    }
    return mA;
  }
}
