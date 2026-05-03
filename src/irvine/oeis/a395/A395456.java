package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395456 allocated for Petro Kolosov.
 * @author Sean A. Irvine
 */
public class A395456 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (long j = 0; j <= 2 * mM; ++j) {
      sum = sum.add(Binomial.binomial(2 * mM, j).multiply(Z.valueOf(2 + mM - j).pow(2 * mN)).multiply(Z.NEG_ONE.pow(j)));
    }
    return sum.divide(Functions.FACTORIAL.z(2 * mM));
  }
}

