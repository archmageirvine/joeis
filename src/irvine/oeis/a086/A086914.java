package irvine.oeis.a086;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086914 a(n) = ((n-1)^n/n)*Sum_{k&gt;=1} (k^n/n^k).
 * @author Sean A. Irvine
 */
public class A086914 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int i = 0; i <= mN; ++i) {
      Z s = Z.ZERO;
      for (int j = 0; j <= i; ++j) {
        s = s.add(Z.NEG_ONE.pow(j).multiply(Binomial.binomial(mN + 1, j).multiply(Z.valueOf(i - j + 1).pow(mN))));
      }
      sum = sum.add(s.multiply(Z.valueOf(mN).pow(i)));
    }
    return sum.divide(mN - 1);
  }
}
