package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036242 Numerator of fraction equal to the continued fraction [0,2,4,...2n].
 * @author Sean A. Irvine
 */
public class A036242 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z t = mB.multiply(2 * mN + 2).add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

