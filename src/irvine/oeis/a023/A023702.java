package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023702 Numbers with exactly 4 2's in their ternary expansion of n.
 * @author Sean A. Irvine
 */
public class A023702 extends Sequence1 {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if (n % 3 == 2 && ++c > 4) {
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

