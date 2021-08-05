package irvine.oeis.a049;

import irvine.math.MemoryFunction1;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049597 Triangular array T(n,k) in which k-th column gives coefficients of sum of Gaussian polynomials [k,m] for m=0..k.
 * @author Sean A. Irvine
 */
public class A049597 extends MemoryFunction1<Polynomial<Z>> implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private int mM = -1;

  @Override
  protected Polynomial<Z> compute(final int n) {
    Polynomial<Z> den = RING.one();
    Polynomial<Z> sum = RING.zero();
    for (int r = 0; r <= n; ++r) {
      Polynomial<Z> num = RING.one();
      for (int k = n - r + 1; k <= n; ++k) {
        num = RING.multiply(num, RING.oneMinusXToTheN(k));
      }
      if (r > 0) {
        den = RING.multiply(den, RING.oneMinusXToTheN(r));
      }
      sum = RING.add(sum, RING.series(num, den, num.degree() - den.degree()));
    }
    //System.out.println(sum);
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM).coeff(mN - mM);
  }
}

