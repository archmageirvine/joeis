package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000898.
 * @author Sean A. Irvine
 */
public class A000898 implements Sequence {

  private long mN = -2;
  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    ++mN;
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = mB.add(mA.multiply(mN)).multiply2();
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

