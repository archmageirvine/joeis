package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077061 a(n) = ( A077059(n)^2 + A077060(n)^2 )^(1/3).
 * @author Sean A. Irvine
 */
public class A077061 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 0) {
        return Z.FOUR; // avoid trivial 0^2+1^2=1^3
      }
      final Z n = Z.valueOf(mN);
      final Z ns = n.square();
      final long lim = ns.multiply(2 * mN).add(1).longValueExact();
      for (long k = mN + 1; k <= lim; ++k) {
        final Z t = ns.add(Z.valueOf(k).square());
        final Z r = t.root(3);
        if (r.auxiliary() == 1) {
          return r;
        }
      }
    }
  }
}

