package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023701 Numbers with exactly <code>3 2</code>'s in their ternary expansion.
 * @author Sean A. Irvine
 */
public class A023701 implements Sequence {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if (n % 3 == 2 && ++c > 3) {
        return false;
      }
      n /= 3;
    }
    return c == 3;
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

