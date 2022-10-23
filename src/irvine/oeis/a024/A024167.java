package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024167 a(n) = n!*(1 - 1/2 + 1/3 - ... + c/n), where c = (-1)^(n+1).
 * @author Sean A. Irvine
 */
public class A024167 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = mA.multiply(++mN).multiply(mN).add(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
