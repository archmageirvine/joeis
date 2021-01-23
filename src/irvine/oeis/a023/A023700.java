package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023700 Numbers with exactly 2 2's in ternary expansion.
 * @author Sean A. Irvine
 */
public class A023700 implements Sequence {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if (n % 3 == 2 && ++c > 2) {
        return false;
      }
      n /= 3;
    }
    return c == 2;
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

