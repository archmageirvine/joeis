package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062135.
 * @author Sean A. Irvine
 */
public class A062145 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private static final Polynomial<Z> C = Polynomial.create(1, -1);
  private Polynomial<Z> mRow = RING.one();
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      ++mN;
      mRow = RING.zero();
      for (int k = 0; k <= mN; ++k) {
        final Z c = Binomial.binomial(mN, k).multiply(F.factorial(2 * mN + 3 - k)).divide(F.factorial(mN - k));
        mRow = RING.add(mRow, RING.multiply(RING.pow(C, k), c).shift(mN - k));
      }
      mRow = RING.divide(mRow, F.factorial(mN + 3));
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
