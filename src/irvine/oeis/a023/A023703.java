package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023703 Numbers with exactly 5 2's in their ternary expansion.
 * @author Sean A. Irvine
 */
public class A023703 extends Sequence1 {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if (n % 3 == 2 && ++c > 5) {
        return false;
      }
      n /= 3;
    }
    return c == 5;
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

