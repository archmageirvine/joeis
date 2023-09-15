package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023713 Numbers with no 2's in their base 4 expansion.
 * @author Sean A. Irvine
 */
public class A023713 extends Sequence1 {

  private long mN = -1;

  private boolean is(long n) {
    while (n != 0) {
      if ((n & 3) == 2) {
        return false;
      }
      n >>>= 2;
    }
    return true;
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

