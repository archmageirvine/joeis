package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010849 Let S(x,y) = number of lattice paths from <code>(0,0)</code> to <code>(x,y)</code> that use the step set <code>{ (0,1), (1,0), (2,0), (3,0), ....}</code> and never pass below <code>y = x.</code> Sequence gives S(n-3,n).
 * @author Sean A. Irvine
 */
public class A010849 implements Sequence {

  private long mN = 2;
  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.FOUR;
        return Z.FOUR;
      }
      mC = Z.valueOf(18);
    } else {
      final Z n = Z.valueOf(++mN);
      final Z t = mC.multiply(n.multiply(7).add(16).multiply(mN).subtract(3))
        .subtract(mB.multiply(n.multiply(7).subtract(2).multiply(mN).subtract(12)))
        .add(mA.multiply(mN - 3).multiply(mN + 1))
        .divide(mN)
        .divide(mN + 4);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}

