package irvine.oeis.a121;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A121933 Number of labeled digraphs with n arcs for which every vertex has indegree at least one and outdegree at least one.
 * @author Gregory Morse
 */
public class A121933 extends Sequence0 {
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final Polynomial<Z> base = RING.onePlusXToTheN(1);
    for (int n = 2; n <= mN; ++n) {
      for (int k = 2; k <= n; ++k) {
        final Polynomial<Z> a = RING.pow(RING.subtract(RING.pow(base, k - 1, mN), RING.one()), k, mN);
        final Polynomial<Z> b = RING.pow(RING.subtract(RING.pow(base, k, mN), RING.one()), n - k, mN);
        sum = sum.signedAdd(((n - k) & 1) == 0, RING.multiply(a, b, mN).coeff(mN).multiply(Binomial.binomial(n, k)));
      }
    }
    return sum;
  }
}
