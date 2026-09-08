package irvine.oeis.a086;

import java.util.List;

import irvine.math.group.MatrixField;
import irvine.math.group.PolynomialRingField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086510 Number of n X n real (0,1)-matrices with all eigenvalues &gt;= 0.
 * @author Sean A. Irvine
 */
public class A086510 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private long mCount = 0;

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

  private static int signChangesAtPositiveInfinity(final List<Polynomial<Q>> seq) {
    int prev = 0;
    int changes = 0;
    for (final Polynomial<Q> p : seq) {
      if (RING.isZero(p)) {
        continue;
      }
      final Q lc = p.leadingCoeff();
      int s = lc.signum();
      if (s != 0) {
        if (prev != 0 && s != prev) {
          ++changes;
        }
        prev = s;
      }
    }
    return changes;
  }

  private boolean is(final DefaultMatrix<Q> m) {
    final MatrixField<Q> fld = new MatrixField<>(mN, Rationals.SINGLETON);
    // This determinant test is for efficiency only
    if (fld.det(m).signum() < 0) {
      return false;
    }
    final Polynomial<Q> p = RING.stripZeroRoots(fld.characteristicPolynomial(m));
    final Polynomial<Q> q = RING.divide(p, RING.gcd(p, RING.diff(p)));
    final List<Polynomial<Q>> sturm = RING.sturmSequence(q);
    return signChangesAtMinusInfinity(sturm) == signChangesAtZero(sturm)
      && signChangesAtMinusInfinity(sturm) - signChangesAtPositiveInfinity(sturm) == q.degree();
  }

  private void search(final DefaultMatrix<Q> m, final long x, final long y) {
    if (y >= mN) {
      if (is(m)) {
        ++mCount;
      }
      return;
    }
    if (x >= mN) {
      search(m, 0, y + 1);
      return;
    }
    search(m, x + 1, y); // M[x,y] = 0
    m.set(x, y, Q.ONE);
    search(m, x + 1, y); // M[x,y] = 1
    m.set(x, y, Q.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    final DefaultMatrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    search(m, 0, 0);
    return Z.valueOf(mCount);
  }
}

