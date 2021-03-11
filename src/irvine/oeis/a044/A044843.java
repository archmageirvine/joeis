package irvine.oeis.a044;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A044843 Positive integers having no fewer base-2 runs of even length than odd.
 * @author Sean A. Irvine
 */
public class A044843 implements Sequence {

  private long mN = 0;

  protected int base() {
    return 2;
  }

  private boolean is(final long n) {
    long prev = -1;
    int len = 0;
    int bias = 0;
    long m = n;
    while (m != 0) {
      final long r = m % base();
      if (r == prev) {
        ++len;
      } else {
        if (prev != -1) {
          bias += 1 - 2 * (len & 1);
        }
        prev = r;
        len = 1;
      }
      m /= base();
    }
    bias += 1 - 2 * (len & 1);
    return bias >= 0;
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

