package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077517 a(1) = 1 and a(n+1) = smallest multiple of a(n) beginning in (n+1).
 * @author Sean A. Irvine
 */
public class A077517 extends Sequence1 {

  private Z mA = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final String s = String.valueOf(mN);
      final Z prev = mA;
      while (!mA.toString().startsWith(s)) {
        mA = mA.add(prev);
      }
    }
    return mA;
  }
}
