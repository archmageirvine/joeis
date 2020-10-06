package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035327 Write n in binary, interchange 0's and 1's, convert back to decimal.
 * @author Sean A. Irvine
 */
public class A035327 implements Sequence {

  private long mN = -1;
  private long mT = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == mT) {
      mT <<= 1;
    }
    return Z.valueOf(mT - mN - 1);
  }
}

