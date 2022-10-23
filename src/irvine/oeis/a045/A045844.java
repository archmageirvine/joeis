package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A045844 a(n+1) = a(n) + largest digit of a(n); a(0) = 1.
 * @author Sean A. Irvine
 */
public class A045844 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(ZUtils.sortDigitsAscending(mA).mod(10));
    return mA;
  }
}

