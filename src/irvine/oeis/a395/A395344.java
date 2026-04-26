package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395255 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395344 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long res = 0;
    for (int k = 0; k < s.length() - 1; ++k) {
      res *= 10;
      res += s.charAt(k) - '0';
      res *= 10;
      res += (s.charAt(k) + s.charAt(k + 1) - 96) % 10; // 96 = 2 * '0'
    }
    return Z.valueOf(res * 10 + s.charAt(s.length() - 1) - '0');
  }
}
