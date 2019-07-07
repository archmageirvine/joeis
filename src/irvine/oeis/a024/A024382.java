package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024382 <code>a(n) = n-th</code> elementary symmetric function of the first <code>n+1</code> positive integers congruent to <code>1 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A024382 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.SIX;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 1) {
      final Z t = mB.multiply(8 * mN - 2).subtract(mA.multiply(4 * mN - 3).multiply(4 * mN - 3));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
