package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052426 Numbers with no two-digit factors (including itself).
 * @author Sean A. Irvine
 */
public class A052426 implements Sequence {

  private long mN = 0;

  private boolean is(final long n) {
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValueExact();
      if (d >= 10 && d < 100) {
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
