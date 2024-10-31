package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072701.
 * @author Sean A. Irvine
 */
public class A072823 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      if (Long.bitCount(++mN) > 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
