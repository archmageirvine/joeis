package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036988 Has simplest possible tree complexity of all transcendental sequences.
 * @author Sean A. Irvine
 */
public class A036988 implements Sequence {

  private long mN = -1;

  private boolean is(long n) {
    int s = 0;
    while (n != 0) {
      s += 1 - 2 * (n & 1);
      if (s < 0) {
        return false;
      }
      n >>>= 1;
    }
    return true;
  }

  @Override
  public Z next() {
    return is(++mN) ? Z.ONE : Z.ZERO;
  }
}
