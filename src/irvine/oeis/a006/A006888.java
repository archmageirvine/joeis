package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006888 a(n) = a(n-1) + a(n-2)*a(n-3) for n &gt; 2 with a(0) = a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A006888 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else if (mB == null) {
        mB = Z.ONE;
      } else {
        mC = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mC.add(mB.multiply(mA));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
