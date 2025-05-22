package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077459 Numbers k such that k and 3*k have the same digital binary sum.
 * @author Sean A. Irvine
 */
public class A077459 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Long.bitCount(++mN) == Long.bitCount(3 * mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
