package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A007618 a(n) = a(n-1) + sum of digits of a(n-1), a(1) = 5.
 * @author Sean A. Irvine
 */
public class A007618 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.add(ZUtils.digitSum(mA));
    return mA;
  }
}

