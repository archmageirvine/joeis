package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053175 Catalan-Larcombe-French sequence.
 * @author Sean A. Irvine
 */
public class A053175 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.EIGHT;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 1) {
      final Z t = mB.multiply(3L * mN * mN - 3 * mN + 1).shiftLeft(3).subtract(mA.multiply(mN * mN - 2 * mN + 1).shiftLeft(7)).divide(mN * mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

