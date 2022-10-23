package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023721 Numbers with no 0's in their base-5 expansion.
 * @author Sean A. Irvine
 */
public class A023721 extends Sequence1 {

  private long mN = 0;

  private boolean is(long n) {
    while (n != 0) {
      if (n % 5 == 0) {
        return false;
      }
      n /= 5;
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

