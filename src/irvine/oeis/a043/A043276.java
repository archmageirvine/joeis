package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A043276 a(n) = maximal run length in base-2 representation of n.
 * @author Sean A. Irvine
 */
public class A043276 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    int max = 0;
    int c = 0;
    long prev = -1;
    long m = ++mN;
    while (m != 0) {
      if ((m & 1) != prev) {
        if (c > max) {
          max = c;
        }
        c = 1;
        prev = m & 1;
      } else {
        ++c;
      }
      m >>>= 1;
    }
    return Z.valueOf(Math.max(c, max));
  }
}
