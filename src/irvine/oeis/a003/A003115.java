package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003115.
 * @author Sean A. Irvine
 */
public class A003115 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.shiftLeft(mN & ~1).subtract(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

