package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067016 Start with a(0)=1, a(1)=4, a(2)=3, a(3)=2; for n&gt;=3, a(n+1) = max_i (a(i)+a(n-i)).
 * @author Sean A. Irvine
 */
public class A067016 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.FOUR;
        return Z.FOUR;
      }
      if (mC == null) {
        mC = Z.THREE;
        return Z.THREE;
      }
      mD = Z.TWO;
      return Z.TWO;
    }
    final Z t = mD.add(1).max(mC.add(4)).max(mB.add(3)).max(mA.add(2));
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}
