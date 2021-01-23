package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011818 Normalized volume of center slice of n-dimensional cube: 2^n* n!*Vol({ (x_1,...,x_n) in [ 0,1 ]^n: n/2 &lt;= Sum_{i = 1..n} x_i &lt;= (n+1)/2 }).
 * @author Sean A. Irvine
 */
public class A011818 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= (mN + 1) / 2; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN + 1, k).multiply(Z.valueOf(mN + 1 - 2 * k).pow(mN)));
    }
    return sum.divide2();
  }
}
