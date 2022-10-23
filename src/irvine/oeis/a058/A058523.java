package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058523 a(1) = a(2) = 1; a(n+2) = a(n+1) + a(n)^a(n+1).
 * @author Sean A. Irvine
 */
public class A058523 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mA.pow(mB).add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
