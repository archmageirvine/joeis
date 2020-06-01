package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001559 <code>a(0) = 1, a(1) = 4;</code> thereafter <code>a(n)*(2n + 10) - a(n-1)*(11n + 35) + a(n-2)*(8n + 2) + a(n-3)*(15n + 7) + a(n-4)*(4n - 2) = 0</code>.
 * @author Sean A. Irvine
 */
public class A001559 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = null;
  private Z mD = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mC == null) {
      mC = Z.ONE;
      return Z.ONE;
    }
    if (mD == null) {
      mD = Z.FOUR;
      return Z.FOUR;
    }
    ++mN;
    final Z t4 = mA.multiply(4 * mN - 2);
    final Z t3 = mB.multiply(15 * mN + 7);
    final Z t2 = mC.multiply(8 * mN + 2);
    final Z t1 = mD.multiply(11 * mN + 35);
    final Z t = t1.subtract(t4).subtract(t3).subtract(t2).divide(2 * mN + 10);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}
