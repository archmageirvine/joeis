package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074204 Numbers k such that the number of 1's in the binary representation of k divides 2^k+1.
 * @author Sean A. Irvine
 */
public class A074204 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long b = Long.bitCount(mN);
      if (Z.TWO.modPow(mN, Z.valueOf(b)).longValueExact() == b - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
