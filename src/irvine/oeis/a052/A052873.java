package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052873 E.g.f. satisfies A(x) = exp(x*A(x)/(1 - x*A(x))).
 * @author Sean A. Irvine
 */
public class A052873 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    Z nk = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k)).multiply(Binomial.binomial(mN - 1, k - 1)).multiply(nk));
      nk = nk.multiply(mN + 1);
    }
    return sum;
  }
}
