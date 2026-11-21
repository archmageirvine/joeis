package irvine.oeis.a051;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051486 Triangle T(n,k) = number of symmetric Boolean functions of n variables and rank from 0 to 2^n.
 * @author Gregory Morse
 */
public class A051486 extends Sequence0 {
  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mM = 0;
  private Polynomial<Z> mRow = RING.one();

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      ++mN;
      mRow = RING.one();
      for (int k = 0; k <= mN; ++k) {
        // The choice to accept weight k adds binomial(n,k) true inputs.
        mRow = RING.multiply(mRow, RING.onePlusXToTheN(Binomial.binomial(mN, k).intValueExact()));
      }
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
