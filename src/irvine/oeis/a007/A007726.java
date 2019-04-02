package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007726 Number of spanning trees of quarter Aztec diamonds of order n.
 * @author Sean A. Irvine
 */
public class A007726 implements Sequence {

  private int mN = 0;

  private CR[] cosines(final int n) {
    final CR[] cos = new CR[n];
    for (int k = 1; k < n; ++k) {
      cos[k] = CR.PI.multiply(CR.valueOf(new Q(k, n))).cos().multiply(CR.TWO);
    }
    return cos;
  }

  @Override
  public Z next() {
    final CR[] cos = cosines(++mN);
    CR prod = CR.ONE;
    for (int j = 1; j < mN; ++j) {
      for (int k = j + 1; k < mN; ++k) {
        final CR c = CR.FOUR.subtract(cos[j]).subtract(cos[k]);
        prod = prod.multiply(c);
      }
    }
    return prod.toZ();
  }
}
