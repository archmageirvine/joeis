package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077060 Smallest k&gt;A077059(n) such that A077059(n)^2+k^2 is a cube (=A077061(n)^3).
 * @author Sean A. Irvine
 */
public class A077060 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
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
    }
  }
}

