package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049445 Numbers k with the property that the number of 1's in binary expansion of k (see A000120) divides k.
 * @author Sean A. Irvine
 */
public class A049445 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % Long.bitCount(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
