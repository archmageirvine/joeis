package irvine.oeis.a079;

import irvine.math.LongUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079327 Smallest nonnegative integer x such that b^(n-1) == b^x (mod n) for all b that are 0 &lt; b &lt; n.
 * @author Sean A. Irvine
 */
public class A079327 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long x) {
    for (long b = 1; b < mN; ++b) {
      if (LongUtils.modPow(b, mN - 1, mN) != LongUtils.modPow(b, x, mN)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (Predicates.PRIME.is(++mN)) {
      return Z.ZERO;
    }
    long x = -1;
    while (true) {
      if (is(++x)) {
        return Z.valueOf(x);
      }
    }
  }
}
