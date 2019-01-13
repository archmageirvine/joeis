package irvine.oeis.a006;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * A006703.
 * @author Sean A. Irvine
 */
public class A006703 extends A006702 {

  @Override
  public Z next() {
    final long s = LongUtils.sqrt(++mN);
    if (s * s == mN) {
      return Z.ZERO;
    }
    return solve(mN).den();
  }
}
