package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007761 <code>(n+1) * a(n+1) - 2 (68*n^2+68*n+27) * a(n) + 6 * n * (772*n^2+35) * a(n-1) - 2 * (2*n-1)^2 * (68*n^2-68*n+27) * a(n-2) + (2*n-1)^2 * (n-1) * (2*n-3)^2 * a(n-3) = 0</code>.
 * @author Sean A. Irvine
 */
public class A007761 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;
  private long mN = 2;

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.valueOf(54);
        return mB;
      }
      if (mC == null) {
        mC = Z.valueOf(6381);
        return mC;
      }
      mD = Z.valueOf(1176900);
    } else {
      final Z n = Z.valueOf(++mN);
      final Z t = mD.multiply(n.multiply(68).add(68).multiply(mN).add(27).multiply2())
        .subtract(mC.multiply(n.square().multiply(772).add(35).multiply(mN).multiply(6)))
        .add(mB.multiply(n.multiply(68).subtract(68).multiply(mN).add(27)).multiply(2 * mN - 1).multiply(2 * mN - 1).multiply2())
        .subtract(mA.multiply(2 * mN - 3).multiply(2 * mN - 3).multiply(mN - 1).multiply(2 * mN - 1).multiply(2 * mN - 1));
      if (t.mod(mN + 1) != 0) {
        throw new RuntimeException("Not an integer at n=" + mN);
      }
      mA = mB;
      mB = mC;
      mC = mD;
      mD = t.divide(mN + 1);
    }
    return mD;
  }
}
