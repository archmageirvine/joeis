package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052558 a(n) = n! *((-1)^n + 2*n + 3)/4.
 * @author Sean A. Irvine
 */
public class A052558 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.add(mA.multiply(mN + 1).multiply(mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
