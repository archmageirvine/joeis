package irvine.oeis.a394;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.group.PolynomialRingField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394665 allocated for Rafa\u0142 Wiktorowicz.
 * @author Sean A. Irvine
 */
public class A394665 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private long mN = 0;

  @Override
  public Z next() {
    final Matrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = Math.max(k - 3, 0); j <= Math.min(k + 3, mN - 1); ++j) {
        m.set(k, j, Z.ONE);
      }
    }
    Polynomial<Q> cp = PolynomialUtils.zToQ(new MatrixField<>(mN, IntegerField.SINGLETON).characteristicPolynomial(m));
    int shift = 0;
    while (cp.coeff(shift).isZero()) {
      ++shift;
    }
    cp = cp.shift(-shift);
    final Polynomial<Q> dcp = RING.diff(cp);
    return Z.valueOf(cp.degree() - RING.gcd(cp, dcp).degree());
  }
}

