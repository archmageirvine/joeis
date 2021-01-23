package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036232 a(n+1) = a(n) + sum of digits of a(n) starting with 211.
 * @author Sean A. Irvine
 */
public class A036232 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(211) : mA.add(ZUtils.digitSum(mA));
    return mA;
  }
}

