package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023729 Numbers with no 2's in their base-5 expansion.
 * @author Sean A. Irvine
 */
public class A023729 implements Sequence {

  private long mN = -1;

  private boolean is(long n) {
    while (n != 0) {
      if (n % 5 == 2) {
        return false;
      }
      n /= 5;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0 || is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

