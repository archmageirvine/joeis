package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023718 Numbers with a single 3 in their base 4 expansion.
 * @author Sean A. Irvine
 */
public class A023718 implements Sequence {

  private long mN = 0;

  private boolean is(long n) {
    int c = 0;
    while (n != 0) {
      if ((n & 3) == 3 && ++c > 1) {
        return false;
      }
      n >>>= 2;
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

