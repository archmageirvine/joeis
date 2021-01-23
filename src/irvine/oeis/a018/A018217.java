package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018217 Sum(C(j)*(n-j)*4^(n-j),j=0..n-1), C = Catalan numbers.
 * @author Sean A. Irvine
 */
public class A018217 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.FOUR;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return mN == 0 ? mA : mB;
    }
    final Z t = mB.multiply(4 * mN + 1).multiply(mN - 1).multiply2()
      .subtract(mA.multiply(2 * mN - 1).multiply(8 * mN))
      .divide(mN - 1).divide(mN);
    mA = mB;
    mB = t;
    return t;
  }
}

