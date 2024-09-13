package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006364 Numbers k with an even number of 1's in binary, ignoring last bit.
 * @author Sean A. Irvine
 */
public class A006364 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if ((Long.bitCount(++mN >>> 1) & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

