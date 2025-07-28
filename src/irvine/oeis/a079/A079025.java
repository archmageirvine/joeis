package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079025 Triangular array read by rows: column sums of frequency distributions associated with number of divisors of least prime signatures.
 * @author Sean A. Irvine
 */
public class A079025 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(1, 1);
  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int m) {
      if (n == 0) {
        return RING.one();
      }
      if (m == 1) {
        return RING.pow(X1, n);
      }
      return RING.add(get(n, m - 1), RING.divide(RING.multiply(RING.oneMinusXToTheN(m + 1), get(n - m, Math.min(n - m, m))), RING.oneMinusXToTheN(1)));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mN).coeff(mM);
  }
}
