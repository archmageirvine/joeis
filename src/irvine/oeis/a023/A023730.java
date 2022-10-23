package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023730 Numbers with a single 2 in their base 5 expansion.
 * @author Sean A. Irvine
 */
public class A023730 extends Sequence1 {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if (n % 5 == 2 && ++c > 1) {
        return false;
      }
      n /= 5;
    }
    return c == 1;
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

