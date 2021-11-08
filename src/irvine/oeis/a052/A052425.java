package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052425 Numbers with no two-digit factors (apart from itself).
 * @author Sean A. Irvine
 */
public class A052425 implements Sequence {

  private long mN = 0;

  private boolean is(final long n) {
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final long d = dd.longValueExact();
      if (d >= 10 && d < 100 && d != n) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
