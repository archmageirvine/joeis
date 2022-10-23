package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A047898 a(1) = 6; for n &gt; 0, a(n+1) = a(n) * (sum of digits of a(n)).
 * @author Sean A. Irvine
 */
public class A047898 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.multiply(ZUtils.digitSum(mA));
    return mA;
  }
}
