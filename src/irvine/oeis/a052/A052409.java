package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052409 a(n) = largest integer power m for which a representation of the form n = k^m exists (for some k).
 * @author Sean A. Irvine
 */
public class A052409 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(Z.ONE)) {
      return Z.ZERO;
    }
    return mN.isPower() == null ? Z.ONE : Z.valueOf(mN.auxiliary());
  }
}
