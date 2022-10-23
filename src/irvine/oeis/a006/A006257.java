package irvine.oeis.a006;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006257 Josephus problem: a(2*n) = 2*a(n)-1, a(2*n+1) = 2*a(n)+1.
 * @author Sean A. Irvine
 */
public class A006257 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((++mN << 1) - LongUtils.nextPowerOf2(mN) + 1);
  }
}
