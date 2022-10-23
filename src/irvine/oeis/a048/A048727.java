package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048727 a(n) = Xmult(n,7) or rule150(n,1).
 * @author Sean A. Irvine
 */
public class A048727 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ (mN << 1) ^ (mN << 2));
  }
}
