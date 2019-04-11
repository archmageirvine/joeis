package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000749 <code>a(n) = 4a(n-1) - 6a(n-2) + 4a(n-3), n &gt; 3,</code> with <code>a(0)=a(1)=a(2)=0, a(3)=1</code>.
 * @author Sean A. Irvine
 */
public class A000749 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == Z.ONE) {
        mA = null;
        return Z.ZERO;
      }
      if (mA == null) {
        mA = Z.ZERO;
        return mA;
      }
      if (mB == null) {
        mB = Z.ZERO;
        return mB;
      }
      mC = Z.ONE;
      return mC;
    }
    final Z t = mC.shiftLeft(2).subtract(mB.multiply(6)).add(mA.shiftLeft(2));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
