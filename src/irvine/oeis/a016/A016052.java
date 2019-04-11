package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A016052 <code>a(1) = 3</code>; for <code>n &gt;= 1, a(n+1) = a(n) +</code> sum of its digits.
 * @author Sean A. Irvine
 */
public class A016052 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.add(ZUtils.digitSum(mA));
    return mA;
  }
}
