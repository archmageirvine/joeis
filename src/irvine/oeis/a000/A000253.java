package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000253 a(n) = 2*a(n-1) - a(n-2) + a(n-3) + 2^(n-1).
 * @author Sean A. Irvine
 */
public class A000253 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private Z mC = Z.FOUR;

  @Override
  public Z next() {
    switch (++mN) {
    case 0:
      return mA;
    case 1:
      return mB;
    case 2:
      return mC;
    default:
      final Z t = mC.multiply2().subtract(mB).add(mA).add(Z.ONE.shiftLeft(mN - 1));
      mA = mB;
      mB = mC;
      mC = t;
      return t;
    }
  }

}

