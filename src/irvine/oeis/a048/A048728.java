package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048728 Differences between A008585 (multiples of 3) and A048724.
 * @author Sean A. Irvine
 */
public class A048728 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(3 * ++mN - ((mN << 1) ^ mN));
  }
}
