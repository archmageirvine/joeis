package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048729 Differences between A008587 (multiples of 5) and A048725.
 * @author Sean A. Irvine
 */
public class A048729 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(5 * ++mN - (mN ^ (mN << 2)));
  }
}
