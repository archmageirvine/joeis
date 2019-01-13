package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005210.
 * @author Sean A. Irvine
 */
public class A005210 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mB.add(mA.multiply2()).subtract(++mN).abs();
    mA = mB;
    mB = t;
    return mB;
  }
}
