package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061377 a(1) = 1, a(n+1) = numerator of the continued fraction [1; 2, 4, 8, ..., 2^n].
 * @author Sean A. Irvine
 */
public class A061377 extends Sequence1 {

  private int mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? mA : mB;
    }
    final Z t = mB.shiftLeft(mN).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

