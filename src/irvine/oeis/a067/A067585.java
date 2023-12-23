package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067585 Binary representation of a(n) is obtained thus: replace every digit in the binary representation of n with "1" if the sum of its neighbors is 1 and with "0" otherwise.
 * @author Sean A. Irvine
 */
public class A067585 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN * 2;
    long r = 0;
    long s = 1;
    do {
      if ((m & 0b101) == 1 || (m & 0b101) == 4) {
        r += s;
      }
      m >>= 1;
      s <<= 1;
    } while (m > 1);
    return Z.valueOf(r);
  }
}
