package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049988 Number of nondecreasing arithmetic progressions of positive integers with sum n.
 * @author Sean A. Irvine
 */
public class A049988 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1 = RING.oneMinusXToTheN(1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> gf = RING.series(RING.one(), X1, mN);
    for (int k = 2; k <= mN; ++k) {
      final int t = Functions.TRIANGULAR.i(k - 1);
      gf = RING.add(gf, RING.series(RING.monomial(Z.ONE, k), RING.multiply(RING.oneMinusXToTheN(t), RING.oneMinusXToTheN(k), mN), mN));
    }
    return gf.coeff(mN);
  }
}

