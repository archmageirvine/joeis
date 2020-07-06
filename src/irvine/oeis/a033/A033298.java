package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033298 <code>a(n+1) = a(n) +</code> sum of digits of <code>a(n)^2</code>.
 * @author Sean A. Irvine
 */
public class A033298 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(ZUtils.digitSum(mA.square()));
    return mA;
  }
}

