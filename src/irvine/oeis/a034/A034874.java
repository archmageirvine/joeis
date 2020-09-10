package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034874 a(n) = n times the reverse of a(n-1).
 * @author Sean A. Irvine
 */
public class A034874 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = ZUtils.reverse(mA).multiply(mN);
    }
    return mA;
  }
}
