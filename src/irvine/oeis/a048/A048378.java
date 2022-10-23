package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048378 Divisible by the concatenation of its first digit-differences (leading zeros allowed).
 * @author Sean A. Irvine
 */
public class A048378 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      long d = 0;
      for (int k = 1; k < s.length(); ++k) {
        d *= 10;
        d += Math.abs(s.charAt(k) - s.charAt(k - 1));
      }
      if (d != 0 && mN % d == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
