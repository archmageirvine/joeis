package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056966 In binary: write what is described (putting a leading zero on numbers which have an odd number of binary digits).
 * @author Sean A. Irvine
 */
public class A056966 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    long res = 0;
    for (int k = (s.length() & 1) == 0 ? 0 : -1; k < s.length(); k += 2) {
      final int c = k < 0 ? 0 : s.charAt(k) - '0';
      if (c > 0) {
        res <<= 1;
        res += s.charAt(k + 1) - '0';
      }
    }
    return Z.valueOf(res);
  }
}
