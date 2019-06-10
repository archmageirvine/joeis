package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023740 Numbers with exactly <code>3 4</code>'s in base 5 expansion.
 * @author Sean A. Irvine
 */
public class A023740 implements Sequence {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if (n % 5 == 4 && ++c > 3) {
        return false;
      }
      n /= 5;
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

