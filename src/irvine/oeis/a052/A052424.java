package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052424 Numbers k with no single-digit factors (apart from 1 and k).
 * @author Sean A. Irvine
 */
public class A052424 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    for (final Z pp : Jaguar.factor(n).toZArray()) {
      final long p = pp.longValueExact();
      if (p < 10 && p != n) {
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
