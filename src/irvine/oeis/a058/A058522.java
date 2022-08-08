package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058522 a(1) = a(2) = 1; a(n+2) = a(n+1) + a(n+1)^a(n).
 * @author Sean A. Irvine
 */
public class A058522 implements Sequence {

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
    final Z t = mB.pow(mA).add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
