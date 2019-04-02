package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A010065 a(n+1) = a(n) + sum of digits in base 4 representation of a(n), with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A010065 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(ZUtils.digitSum(mA, Z.FOUR));
    return mA;
  }
}

