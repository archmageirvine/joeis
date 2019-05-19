package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022558.
 * @author Sean A. Irvine
 */
public class A022558 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(7 * mN - 22).add(mA.multiply(8 * mN - 4)).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

