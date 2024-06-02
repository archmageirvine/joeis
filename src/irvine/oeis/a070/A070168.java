package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070168 Irregular triangle of Terras-modified Collatz problem.
 * @author Sean A. Irvine
 */
public class A070168 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mA.equals(Z.ONE)) {
      mA = Z.valueOf(++mN);
    } else {
      mA = mA.isEven() ? mA.divide2() : mA.multiply(3).add(1).divide2();
    }
    return mA;
  }
}
