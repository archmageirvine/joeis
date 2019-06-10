package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023695 Numbers with exactly <code>4 1</code>'s in ternary expansion.
 * @author Sean A. Irvine
 */
public class A023695 implements Sequence {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if (n % 3 == 1 && ++c > 4) {
        return false;
      }
      n /= 3;
    }
    return c == 4;
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

