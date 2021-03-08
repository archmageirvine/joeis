package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043277 Maximal run length in base 3 representation of n.
 * @author Sean A. Irvine
 */
public class A043277 implements Sequence {

  private long mN = 0;

  protected int base() {
    return 3;
  }

  @Override
  public Z next() {
    int max = 0;
    int c = 0;
    long prev = -1;
    long m = ++mN;
    while (m != 0) {
      final long r = m % base();
      m /= base();
      if (r != prev) {
        if (c > max) {
          max = c;
        }
        c = 1;
        prev = r;
      } else {
        ++c;
      }
    }
    return Z.valueOf(Math.max(c, max));
  }
}
