package irvine.oeis.a082;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082408 Least k such that the continued fraction for n/k contains no element &gt; 2.
 * @author Sean A. Irvine
 */
public class A082408 extends Sequence1 {

  private long mN = 0;

  private boolean is(final Q n) {
    for (final Z t : ContinuedFractionUtils.continuedFraction(n)) {
      if (t.compareTo(Z.TWO) > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (is(new Q(mN, ++k))) {
        return Z.valueOf(k);
      }
    }
  }
}
