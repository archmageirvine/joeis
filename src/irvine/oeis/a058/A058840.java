package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058840 From Renyi's "beta expansion of 1 in base 3/2": sequence gives y(0), y(1), ...
 * @author Sean A. Irvine
 */
public class A058840 extends Sequence0 {

  private Z mC = Z.TWO;
  private Z mD = Z.ONE;

  @Override
  public Z next() {
    final int t = mC.compareTo(mD);
    if (t >= 0) {
      mC = mC.subtract(mD);
    }
    mC = mC.multiply(3);
    mD = mD.multiply2();
    return t >= 0 ? Z.ONE : Z.ZERO;
  }
}
