package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391869 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A391869 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toString(++mN);
    final int r = s.charAt(0) & 1;
    long res = 0;
    for (int k = 0; k < s.length(); ++k) {
      if ((s.charAt(k) & 1) == r) {
        res *= 10;
        res += s.charAt(k) - '0';
      }
    }
    return Z.valueOf(res);
  }
}
