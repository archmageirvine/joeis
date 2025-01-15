package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074203 Odd numbers k such that the number of 1's in the binary representation of k divides 2^k-1.
 * @author Sean A. Irvine
 */
public class A074203 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long b = Long.bitCount(mN);
      if (Z.TWO.modPow(mN, Z.valueOf(b)).longValueExact() == 1 % b) {
        return Z.valueOf(mN);
      }
    }
  }
}
