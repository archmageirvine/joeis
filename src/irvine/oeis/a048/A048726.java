package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048726 a(n) = Xmult(n,6), or 2*A048724(n).
 * @author Sean A. Irvine
 */
public class A048726 extends Sequence0 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mN ^ (mN << 1));
  }
}
