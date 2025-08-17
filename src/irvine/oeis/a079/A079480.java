package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079480 a(1) = 1; a(2) = 2; a(n) = LS(a(n-1)) + LS(a(n-2)) if n &gt; 2, where LS(m) = the "Look and Say" description (A045918) of m.
 * @author Sean A. Irvine
 */
public class A079480 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = Functions.LOOK_AND_SAY.z(mA).add(Functions.LOOK_AND_SAY.z(mB));
    mA = mB;
    mB = t;
    return t;
  }
}
