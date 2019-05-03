package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053117 Triangle read by rows of coefficients of Chebyshev's <code>U(n,x)</code> polynomials (exponents in increasing order).
 * @author Sean A. Irvine
 */
public class A053117 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (mN < 0) {
      ++mN;
      return Z.ONE;
    }
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (((mN + mM) & 1) == 1) {
      return Z.ZERO;
    }
    final Z t = Binomial.binomial((mN + mM) / 2, mM).shiftLeft(mM);
    return (((mN + mM) / 2 + mM) & 1) == 0 ? t : t.negate();
  }
}
