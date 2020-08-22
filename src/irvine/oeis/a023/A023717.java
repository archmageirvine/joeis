package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023717 Numbers with no 3's in base-4 expansion.
 * @author Sean A. Irvine
 */
public class A023717 implements Sequence {

  private long mN = -1;

  private boolean is(long n) {
    while (n != 0) {
      if ((n & 3) == 3) {
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

