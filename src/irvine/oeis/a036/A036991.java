package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036991 Numbers n with the property that in the binary expansion of n, reading from right to left, the number of 0's never exceeds the number of 1's.
 * @author Sean A. Irvine
 */
public class A036991 implements Sequence {

  private long mN = -1;

  private boolean is(long n) {
    int s = 0;
    while (n != 0) {
      s += 1 - 2 * (n & 1);
      if (s > 0) {
        return false;
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
