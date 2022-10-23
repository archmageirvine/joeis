package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006958 Number of parallelogram polyominoes with n cells (also called staircase polyominoes, although that term is overused).
 * @author Sean A. Irvine
 */
public class A006958 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int m = (int) Math.ceil(Math.sqrt(mN + 1));
    Polynomial<Z> c = RING.one();
    for (int j = m; j >= 1; --j) {
      c = RING.series(RING.one(),
        RING.subtract(RING.one(),
          RING.series(RING.monomial(Z.ONE, j),
            RING.subtract(RING.one(), c.shift(j)), mN)), mN);
    }
    return c.coeff(mN);
  }
}
