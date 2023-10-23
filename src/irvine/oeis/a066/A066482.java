package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A066482 The smallest anti-divisor of n.
 * @author Sean A. Irvine
 */
public class A066482 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    for (long k = 2; k < mN; ++k) {
      if (Math.abs(2 * (mN % k) - k) < 2) {
        return Z.valueOf(k);
      }
    }
    return Z.ONE;
  }
}

