package irvine.oeis.a044;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A044933 Number of runs of even length in the base-2 representation of n.
 * @author Sean A. Irvine
 */
public class A044933 extends Sequence1 {

  private long mN = 0;

  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    final long n = ++mN;
    long prev = -1;
    int len = 0;
    int cnt = 0;
    long m = n;
    while (m != 0) {
      final long r = m % base();
      if (r == prev) {
        ++len;
      } else {
        if (prev != -1 && (len & 1) == 0) {
          ++cnt;
        }
        prev = r;
        len = 1;
      }
      m /= base();
    }
    if ((len & 1) == 0) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

