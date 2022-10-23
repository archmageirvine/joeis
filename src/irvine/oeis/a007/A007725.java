package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007725 Number of spanning trees of Aztec diamonds of order n.
 * @author Sean A. Irvine
 */
public class A007725 extends Sequence0 {

  private int mN = -1;

  private CR[] cosines(final int n) {
    final CR[] cos = new CR[n];
    for (int k = 1; k < n; ++k) {
      cos[k] = CR.HALF_PI.multiply(new Q(k, n)).cos();
    }
    return cos;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CR[] cos = cosines(mN);
    CR prod = CR.ONE;
    for (int j = 1; j < mN; ++j) {
      for (int k = 1; k < mN; ++k) {
        final CR c = cos[j].multiply(cos[k]);
        final CR a = CR.ONE.subtract(c).multiply(CR.FOUR);
        final CR b = CR.ONE.add(c).multiply(CR.FOUR);
        prod = prod.multiply(a.multiply(b));
      }
    }
    return prod.multiply(ComputableReals.SINGLETON.pow(CR.FOUR, 2 * mN - 1)).toZ();
  }
}
