package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036556 Integers which when multiplied by 3 have an odd number of 1's in their binary expansion (cf. A000069).
 * @author Sean A. Irvine
 */
public class A036556 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      if ((Long.bitCount(3 * ++mN) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
