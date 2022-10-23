package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000069 Odious numbers: numbers with an odd number of 1's in their binary expansion.
 * @author Sean A. Irvine
 */
public class A000069 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if ((Long.bitCount(++mN) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

