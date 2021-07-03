package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048726 a(n) = Xmult(n,6), or 2*A048724(n).
 * @author Sean A. Irvine
 */
public class A048726 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mN ^ (mN << 1));
  }
}
