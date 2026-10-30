package irvine.oeis.a087;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087127 This table shows the coefficients of combinatorial formulas needed for generating the sequential sums of p-th powers of triangular numbers. The p-th row (p&gt;=1) contains a(i,p) for i=1 to 2*p-1, where a(i,p) satisfies Sum_{i=1..n} C(i+1,2)^p = 3 * C(n+2,3) * Sum_{i=1..2*p-1} a(i,p) * C(n-1,i-1)/(i+2).
 * @author Sean A. Irvine
 */
public class A087127 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (long j = 0; j <= mM; ++j) {
      sum = sum.add(Z.NEG_ONE.pow(mM - j).multiply(Binomial.binomial(mM, j)).multiply(Binomial.binomial(j + 2, 2).pow(mN)));
    }
    return sum;
  }
}

