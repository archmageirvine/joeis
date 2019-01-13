package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001475.
 * @author Sean A. Irvine
 */
public class A001475 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN > 2) {
      final Z t = mB.add(mA.multiply(mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
