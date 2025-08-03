package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386501 Numbers k divisible by A004719(k), excluding trivial cases.
 * @author Sean A. Irvine
 */
public class A386501 extends Sequence1 {

  private long mN = 104;

  private long nozero(final long n) {
    return Long.parseLong(Long.toString(n).replace("0", ""));
  }

  private boolean is(final long n) {
    final long n0 = nozero(n);
    if (n0 == n) {
      return false;
    }
    if (n % n0 != 0) {
      return false;
    }
    if (n % 10 != 0) {
      return true;
    }
    final long n10 = n / 10;
    return n10 % nozero(n10) != 0;
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

