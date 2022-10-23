package irvine.oeis.a044;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A044873 Numbers having, in base 2, (sum of even run lengths)=(sum of odd run lengths).
 * @author Sean A. Irvine
 */
public class A044873 extends Sequence1 {

  private long mN = 0;

  protected int base() {
    return 2;
  }

  private boolean is(final long n) {
    long prev = -1;
    int len = 0;
    final int[] sum = new int[2];
    long m = n;
    while (m != 0) {
      final long r = m % base();
      if (r == prev) {
        ++len;
      } else {
        if (prev != -1) {
          sum[len & 1] += len;
        }
        prev = r;
        len = 1;
      }
      m /= base();
    }
    sum[len & 1] += len;
    return sum[0] == sum[1];
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

