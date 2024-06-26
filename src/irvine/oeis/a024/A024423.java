package irvine.oeis.a024;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024423 Sum of [ S(n,m)/C(n-1,m-1) ] for m = 1,2,...,n; S(n,m) are Stirling numbers of second kind.
 * @author Sean A. Irvine
 */
public class A024423 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING2.z(mN, k).divide(Binomial.binomial(mN - 1, k - 1)));
    }
    return sum;
  }
}
