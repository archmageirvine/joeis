package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029758 Number of AVL trees of height <code>n</code>.
 * @author Sean A. Irvine
 */
public class A029758 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.ONE;
    } else {
      final Z t = mB.add(mA.multiply2()).multiply(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
