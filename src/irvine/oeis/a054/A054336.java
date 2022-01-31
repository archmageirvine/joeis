package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a053.A053121;

/**
 * A054336 A convolution triangle of numbers based on A001405 (central binomial coefficients).
 * @author Sean A. Irvine
 */
public class A054336 extends A053121 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, n, k -> get(n, k).multiply(Binomial.binomial(k, m)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
