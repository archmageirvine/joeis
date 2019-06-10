package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023734 Numbers with a single 3 in their <code>base-5</code> expansion.
 * @author Sean A. Irvine
 */
public class A023734 implements Sequence {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if (n % 5 == 3 && ++c > 1) {
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

