package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039691 If n=x1x2...xm in base 10, n belongs to the sequence iff x1x2..xm*11=y1y2...ym and xm..x2x1*11=ym...y2y1.
 * @author Sean A. Irvine
 */
public class A039691 implements Sequence {

  private long mN = -1;

  private boolean is(long n) {
    long a = n % 10;
    n /= 10;
    while (n != 0) {
      final long b = n % 10;
      if (a + b >= 10) {
        return false;
      }
      a = b;
      n /= 10;
    }
    return true;
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
