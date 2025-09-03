package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080073 The exponential generating function A(x) = Sum a(j) x^j/j! satisfies the functional equation A(x)=1+x*(A(x))*(1-log(A(x))).
 * @author Sean A. Irvine
 */
public class A080073 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      Z s = Z.ZERO;
      for (int j = 0; j <= mN; ++j) {
        s = s.signedAdd((j & 1) == 0, Functions.FACTORIAL.z(j).multiply(Binomial.binomial(mN, j)).multiply(Functions.STIRLING1.z(mN - k - 1, j)));
      }
      sum = sum.add(Functions.FACTORIAL.z(mN - 1).divide(Functions.FACTORIAL.z(mN - k - 1)).multiply(s.multiply(Binomial.binomial(mN, k))));
    }
    return sum;
  }
}

