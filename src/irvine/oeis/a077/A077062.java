package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077062 Minimal k &gt; n such that n^2 + k^2 is a cube for k &gt; n, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A077062 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.EIGHT; // avoid trivial 0^2+1^2=1^3
    }
    final Z n = Z.valueOf(mN);
    final Z ns = n.square();
    final long lim = ns.multiply(2 * mN).add(1).longValueExact();
    for (long k = mN + 1; k <= lim; ++k) {
      if (Predicates.CUBE.is(ns.add(Z.valueOf(k).square()))) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}

