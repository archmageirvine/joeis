package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001685.
 * @author Sean A. Irvine
 */
public class A001685 implements Sequence {

  private long mN = -1;
  private Z mA = Z.TWO;
  private Z mB = Z.THREE;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.valueOf(mN + 1);
    }
    final Z t = mA.add(mB.multiply(mP));
    mP = mP.multiply(mA);
    mA = mB;
    mB = t;
    return mB;
  }
}
