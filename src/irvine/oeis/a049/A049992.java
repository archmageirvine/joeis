package irvine.oeis.a049;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A049992 a(n) is the number of arithmetic progressions of 3 or more positive integers, nondecreasing with sum n.
 * @author Sean A. Irvine
 */
public class A049992 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> gf = RING.zero();
    for (int k = 3; k <= mN; ++k) {
      final int t = A000217.triangular(k - 1).intValueExact();
      gf = RING.add(gf, RING.series(RING.monomial(Z.ONE, k), RING.multiply(RING.oneMinusXToTheN(t), RING.oneMinusXToTheN(k), mN), mN));
    }
    return gf.coeff(mN);
  }
}

