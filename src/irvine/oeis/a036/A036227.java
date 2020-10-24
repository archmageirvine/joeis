package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036227 a(1) = 20; a(n+1) = a(n) + sum of decimal digits of a(n).
 * @author Sean A. Irvine
 */
public class A036227 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(20) : mA.add(ZUtils.digitSum(mA));
    return mA;
  }
}

