package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383668 Numbers whose binary representation has a positive number of 0s, all with even runlength.
 * @author Sean A. Irvine
 */
public class A383668 extends Sequence1 {

  private long mN = 1;

  private boolean is(long n) {
    if ((n & (n + 1)) == 0) {
      return false;  // 2^t-1
    }
    int zeros = 0;
    while (n != 0) {
      if ((n & 1) == 1) {
        if (zeros > 0 && (zeros & 1) == 1) {
          return false;
        }
        zeros = 0;
      } else {
        ++zeros;
      }
      n >>>= 1;
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
