package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049445 Numbers n with property that the number of 1's in binary expansion of n (see A000120) divides n.
 * @author Sean A. Irvine
 */
public class A049445 implements Sequence {

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
