package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006604 Generalized Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A006604 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2 + 1; ++k) {
      Z t = Z.ZERO;
      for (int j = 0; j <= mN - 2 * k + 2; ++j) {
        t = t.signedAdd((j & 1) == 0, Binomial.binomial(mN - k + 2, j).multiply(Binomial.binomial(2 * mN - 3 * k - j + 3, mN - k + 1)).shiftLeft(mN - 2 * k - j + 2));
      }
      sum = sum.add(t.multiply(k).divide(mN - k + 2));
    }
    return sum;
  }
}
