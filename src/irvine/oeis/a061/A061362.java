package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061362 Numbers in which each nonzero digit divides the number formed by the rest, i.e., the number obtained by just removing this digit. 0 is divisible by every number.
 * @author Sean A. Irvine
 */
public class A061362 extends Sequence0 {

  private long mN = 0;

  private boolean is(final long n) {
    if (n < 10) {
      return true;
    }
    final String s = Long.toString(n);
    for (int k = 0; k < s.length(); ++k) {
      final int d = s.charAt(k) - '0';
      if (d != 0 && Long.parseLong(s.substring(0, k) + s.substring(k + 1)) % d != 0) {
        return false;
      }
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

