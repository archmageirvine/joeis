package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038557 Periodic derivative of n in base 3.
 * @author Sean A. Irvine
 */
public class A038557 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toString(++mN, 3);
    long res = 0;
    for (int k = 0; k < s.length(); ++k) {
      res *= 3;
      res += (s.charAt(k) + s.charAt((k + 1) % s.length())) % 3;
    }
    return Z.valueOf(res);
  }
}
