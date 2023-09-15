package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023704 Numbers with exactly 6 2's in their ternary expansion.
 * @author Sean A. Irvine
 */
public class A023704 extends Sequence1 {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if (n % 3 == 2 && ++c > 6) {
        return false;
      }
      n /= 3;
    }
    return c == 6;
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

