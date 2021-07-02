package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048724 Write n and 2n in binary and add them mod 2.
 * @author Sean A. Irvine
 */
public class A048724 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ (mN << 1));
  }
}
