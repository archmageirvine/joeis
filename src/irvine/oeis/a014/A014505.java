package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014505 Number of digraphs with unlabeled (non-isolated) nodes and n labeled edges.
 * @author Sean A. Irvine
 */
public class A014505 extends Sequence0 {

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    Q sum = Q.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k <= 3 * mN; ++k) {
      if (k > 1) {
        f = f.multiply(k);
      }
      sum = sum.add(new Q(Binomial.binomial(k * (k - 1), mN), f));
    }
    return CR.valueOf(sum.multiply(mF)).divide(CR.E).round();
  }
}
