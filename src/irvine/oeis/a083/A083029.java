package irvine.oeis.a083;

import java.util.List;

import irvine.math.group.MatrixField;
import irvine.math.group.PolynomialRingField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.a080.A080858;

/**
 * A083029 Triangle read by rows: T(n,k), n &gt;=1, 0 &lt;= k &lt;= C(n,k), = number of n X n symmetric positive semi-definite matrices with 2's on the main diagonal and 1's and 0's elsewhere and with k 1's above the diagonal.
 * @author Sean A. Irvine
 */
public class A083029 extends A080858 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private static int signChangesAtZero(final List<Polynomial<Q>> seq) {
    int prev = 0;
    int changes = 0;
    for (final Polynomial<Q> p : seq) {
      final int s = p.coeff(0).signum();
      if (s != 0) {
        if (prev != 0 && s != prev) {
          ++changes;
        }
        prev = s;
      }
    }
    return changes;
  }

  private static int signChangesAtMinusInfinity(final List<Polynomial<Q>> seq) {
    int prev = 0;
    int changes = 0;
    for (final Polynomial<Q> p : seq) {
      if (RING.isZero(p)) {
        continue;
      }
      final Q lc = p.leadingCoeff();
      int s = lc.signum();
      if ((p.degree() & 1) == 1) {
        s = -s;
      }
      if (s != 0) {
        if (prev != 0 && s != prev) {
          ++changes;
        }
        prev = s;
      }
    }
    return changes;
  }

  @Override
  protected boolean is(final DefaultMatrix<Q> m) {
    final MatrixField<Q> fld = new MatrixField<>(mN, Rationals.SINGLETON);
    // This determinant test is for efficiency only
    if (fld.det(m).signum() < 0) {
      return false;
    }
    final Polynomial<Q> p = fld.characteristicPolynomial(m);
    final List<Polynomial<Q>> sturm = RING.sturmSequence(RING.stripZeroRoots(p));
    return signChangesAtMinusInfinity(sturm) == signChangesAtZero(sturm);
  }
}

