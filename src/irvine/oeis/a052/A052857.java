package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052857 A simple grammar.
 * @author Sean A. Irvine
 */
public class A052857 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN);
    }
    Z sum = Z.ZERO;
    Z nk = Z.ONE;
    for (int k = 1; k < mN; ++k) {
      nk = nk.multiply(mN);
      sum = sum.add(Functions.FACTORIAL.z(mN - 1).divide(Functions.FACTORIAL.z(k)).multiply(Binomial.binomial(mN - 2, k - 1)).multiply(nk));
    }
    return sum;
  }
}

