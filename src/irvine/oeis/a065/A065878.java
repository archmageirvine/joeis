package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065878 Numbers which are not an integer multiple of their number of binary 1's.
 * @author Sean A. Irvine
 */
public class A065878 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % Long.bitCount(mN) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
