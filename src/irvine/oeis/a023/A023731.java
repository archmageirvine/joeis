package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023731 Numbers with exactly two <code>2</code>'s in base 5 expansion.
 * @author Sean A. Irvine
 */
public class A023731 implements Sequence {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if (n % 5 == 2 && ++c > 2) {
        return false;
      }
      n /= 5;
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

