package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082927 Numbers in which at least one pair of adjacent digits differ by 1.
 * @author Sean A. Irvine
 */
public class A082927 extends Sequence1 {

  private long mN = 9;

  private boolean is(long n) {
    long r = n % 10;
    while (n != 0) {
      final long p = r;
      r = n % 10;
      if (Math.abs(p - r) == 1) {
        return true;
      }
      n /= 10;
    }
    return false;
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
