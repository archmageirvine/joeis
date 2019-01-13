package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006888.
 * @author Sean A. Irvine
 */
public class A006888 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else if (mB == null) {
        mB = Z.ONE;
      } else {
        mC = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mC.add(mB.multiply(mA));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
