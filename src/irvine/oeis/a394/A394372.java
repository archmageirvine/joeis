package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394372 allocated for Wang Yixiang.
 * @author Sean A. Irvine
 */
public class A394372 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.TWO;
  private Z mC = Z.THREE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.valueOf(mN);
    }
    final Z t = mC.add(Functions.GCD.z(mN, mA.multiply(mB)));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
