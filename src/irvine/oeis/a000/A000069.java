package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000069 Odious numbers: numbers with an odd number of <code>1</code>'s in their binary expansion.
 * @author Sean A. Irvine
 */
public class A000069 implements Sequence {

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

