package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A090000 Length of longest contiguous block of 1's in binary expansion of n-th prime.
 * @author jmason
 * @author Sean A. Irvine
 */
public class A090000 extends A000040 {

  /* Calculate the maximum length of longest contiguous block of 1's in binary expansion of n */
  private int maxBitLength(final Z p) {
    int currMax = 0;
    int currLen = 0;
    for (int k = 0; k < p.bitLength(); ++k) {
      if (p.testBit(k)) {
        if (++currLen > currMax) {
          currMax = currLen;
        }
      } else {
        currLen = 0;
      }
    }
    return currMax;
  }

  @Override
  public Z next() {
    return Z.valueOf(maxBitLength(super.next()));
  }
}
