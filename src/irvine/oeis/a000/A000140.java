package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000140 Kendall-Mann numbers: the maximal number of inversions in a permutation on n letters is floor(n*(n-1)/4); a(n) is the number of permutations with this many inversions.
 * @author Sean A. Irvine
 */
public class A000140 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private Polynomial<Z> mProduct = RING.one();
  private Polynomial<Z> mTerm = RING.zero();

  @Override
  public Z next() {
    final int degree = mTerm.degree();
    mTerm = RING.add(mTerm, RING.monomial(Z.ONE, degree + 1));
    mProduct = RING.multiply(mProduct, mTerm);
    Z max = Z.ZERO;
    for (int k = 0; k <= mProduct.degree(); ++k) {
      final Z c = mProduct.coeff(k);
      if (c.compareTo(max) > 0) {
        max = c;
      }
    }
    return max;
  }
}

