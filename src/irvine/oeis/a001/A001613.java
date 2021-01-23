package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001613 Delete all odd digits from n.
 * @author Sean A. Irvine
 */
public class A001613 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long r = 0;
    for (int k = 0; k < s.length(); ++k) {
      final int d = s.charAt(k) - '0';
      if ((d & 1) == 0) {
        r *= 10;
        r += d;
      }
    }
    return Z.valueOf(r);
  }
}
