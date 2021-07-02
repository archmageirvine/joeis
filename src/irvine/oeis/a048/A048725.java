package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048725 a(n) = Xmult(n,5) or rule90(n,1).
 * @author Sean A. Irvine
 */
public class A048725 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ (mN << 2));
  }
}
