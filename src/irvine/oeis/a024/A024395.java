package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024395 <code>a(n) = n-th</code> elementary symmetric function of the first <code>n+1</code> positive integers congruent to <code>2 mod 3</code>.
 * @author Sean A. Irvine
 */
public class A024395 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.SEVEN;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 1) {
      final Z t = mB.multiply(6 * mN + 1).subtract(mA.multiply(3 * mN - 1).multiply(3 * mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
