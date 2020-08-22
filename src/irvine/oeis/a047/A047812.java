package irvine.oeis.a047;

import irvine.math.MemoryFunction;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047812 Parker's partition triangle T(n,k) read by rows (n &gt;= 1 and 0 &lt;= k &lt;= n-1).
 * @author Sean A. Irvine
 */
public class A047812 extends MemoryFunction<Integer, Polynomial<Z>> implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final Integer n) {
    final int n2 = n * n;
    Polynomial<Z> prod = RING.one();
    for (int k = 0; k < n; ++k) {
      prod = RING.multiply(prod, RING.series(RING.oneMinusXToTheN(2 * n - k), RING.oneMinusXToTheN(k + 1), n2), n2);
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return getValue(mN).coeff(mM * (mN + 1));
  }
}
