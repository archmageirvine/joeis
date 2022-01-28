package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023705 Numbers with no 0's in base-4 expansion.
 * @author Sean A. Irvine
 */
public class A023705 implements Sequence {

  private long mN = 0;

  private boolean is(long n) {
    while (n != 0) {
      if ((n & 3) == 0) {
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

