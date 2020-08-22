package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024395 a(n) = n-th elementary symmetric function of the first n+1 positive integers congruent to 2 mod 3.
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
