package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048730 Differences between A008589 (multiples of 7) and A048727, a(n) = ((n*7)-Xmult(n,7)).
 * @author Sean A. Irvine
 */
public class A048730 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(7 * ++mN - (mN ^ (mN << 1) ^ (mN << 2)));
  }
}
