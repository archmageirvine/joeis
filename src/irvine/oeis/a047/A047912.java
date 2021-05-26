package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A047912 a(1) = 3; for n &gt; 0, a(n+1) = a(n) * sum of digits of a(n).
 * @author Sean A. Irvine
 */
public class A047912 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply(ZUtils.digitSum(mA));
    return mA;
  }
}
