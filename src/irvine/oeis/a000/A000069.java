package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000069 Odious numbers: numbers with <code>an</code> odd number of 1's in their binary expansion.
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

