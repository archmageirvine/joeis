package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074401 2^n contains all divisors of n as substrings.
 * @author Sean A. Irvine
 */
public class A074401 extends Sequence1 {

  private long mN = 36;

  private boolean is(final long n) {
    final String s = Z.ONE.shiftLeft(n).toString();
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (!s.contains(d.toString())) {
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
