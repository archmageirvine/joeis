package irvine.oeis.a056;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A056198 Defined by Product 1/(1-x^k)^a_k, k=1..inf = 1+x+2*Sum(a_k*x^k, k=2..inf).
 * @author Sean A. Irvine
 */
public class A056198 extends MemorySequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  {
    setOffset(1);
    add(Z.ZERO); // 0th
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(n);
    }
    Polynomial<Z> den = RING.one();
    for (int k = 1; k < n; ++k) {
      den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(k), get(k), n), n);
    }
    return RING.coeff(RING.one(), den, n);
  }
}
