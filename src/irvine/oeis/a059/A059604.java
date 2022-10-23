package irvine.oeis.a059;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059604 Coefficients of polynomials (n-1)!*P(n,k), P(n,k) = Sum_{i=0..n} Stirling2(n,i)*binomial(k+i-1,k).
 * @author Sean A. Irvine
 */
public class A059604 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Z> mGf = null;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mN++;
      Polynomial<Z> sum = RING.zero();
      Polynomial<Z> prod = RING.one();
      for (int k = 1; k <= mN; ++k) {
        if (k > 1) {
          prod = RING.multiply(prod, Polynomial.create(k - 1, 1));
        }
        final Polynomial<Z> t = RING.multiply(prod, Stirling.secondKind(mN, k).multiply(MemoryFactorial.SINGLETON.factorial(mN - 1)).divide(MemoryFactorial.SINGLETON.factorial(Math.max(k - 1, 0))));
        sum = RING.add(sum, t);
      }
      mGf = sum;
    }
    return mGf.coeff(mM);
  }
}
