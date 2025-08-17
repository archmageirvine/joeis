package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079466.
 * @author Sean A. Irvine
 */
public class A079471 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ZERO;
    }
    while (true) {
      ++mN;
      if (Long.bitCount(mN) == Long.lowestOneBit(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

