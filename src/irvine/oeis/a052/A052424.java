package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052424 Numbers with no single-digit factors (apart from 1 and n).
 * @author Sean A. Irvine
 */
public class A052424 implements Sequence {

  private long mN = 0;

  private boolean is(final long n) {
    for (final Z pp : Cheetah.factor(n).toZArray()) {
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
