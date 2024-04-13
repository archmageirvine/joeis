package irvine.oeis.a188;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A188445 T(n,k) is the number of (n*k) X k binary arrays with nonzero rows in decreasing order and n ones in every column.
 * @author Sean A. Irvine
 */
public class A188445 extends Sequence1 {

  // After Andrew Howroyd

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  protected static final Polynomial<Q> CMX = Polynomial.create(Q.ONE, Q.NEG_ONE);
  private static final Polynomial<Q> CPX = Polynomial.create(Q.ONE, Q.ONE);
  private int mN = 0;
  private int mM = 0;

  protected boolean isMaxPart(final int[] p, final int max) {
    for (final int v : p) {
      if (v > max) {
        return false;
      }
    }
    return true;
  }

  protected Q d(final int[] p, final int n, final int k) {
    final int[] c = new int[n + 1];
    IntegerPartition.toCountForm(p, c);
    final WeighTransformSequence w = new WeighTransformSequence(new FiniteSequence(c));
    for (int j = 0; j < n; ++j) {
      w.next();
    }
    final Z t = w.next().pow(k);
    return new Q(t, SymmetricGroup.per(c));
  }

  protected Z t(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    final int m = n * k + 1;
    final Polynomial<Q> i = RING.integrate(RING.negate(RING.series(RING.monomial(Q.ONE, n), CMX, m - 1)));
    final Polynomial<Q> q = RING.series(RING.exp(i, m), CPX, m);
    Q sum = Q.ZERO;
    for (int j = 0; j <= m; ++j) {
      Q s = Q.ZERO;
      final IntegerPartition part = new IntegerPartition(j);
      int[] p;
      while ((p = part.next()) != null) {
        if (isMaxPart(p, n)) {
          s = s.signedAdd((p.length & 1) == 0, d(p, n, k));
        }
      }
      sum = sum.add(s.multiply(q.coeff(q.degree() - j)));
    }
    sum = sum.divide(2);
    return (m & 1) == 0 ? sum.toZ() : sum.toZ().negate();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mM, mN + 1 - mM);
  }
}
