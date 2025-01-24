package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074493 Numbers n such that all the divisors of n appear as substrings in n^3.
 * @author Sean A. Irvine
 */
public class A074493 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final String s = Z.valueOf(n).pow(3).toString();
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
