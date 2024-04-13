package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069218.
 * @author Sean A. Irvine
 */
public class A069218 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      } else {
        mB = Z.EIGHT;
        return Z.EIGHT;
      }
    }
    final Z t = mA.add(mB);
    mA = mB;
    if (t.mod(3) == 0) {
      mB = t.divide(3);
    } else if (t.isEven()) {
      mB = t.divide2();
    } else {
      mB = t;
    }
    return mB;
  }
}

