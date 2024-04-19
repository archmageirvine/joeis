package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002868 Largest number in n-th row of triangle of Lah numbers (A008297 and A271703).
 * @author Sean A. Irvine
 */
public class A002868 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z res = Z.ONE;
    for (int m = 1; m <= mN; ++m) {
      res = res.max(Functions.FACTORIAL.z(mN).multiply(Binomial.binomial(mN - 1, m - 1)).divide(Functions.FACTORIAL.z(m)));
    }
    return res;
  }
}

