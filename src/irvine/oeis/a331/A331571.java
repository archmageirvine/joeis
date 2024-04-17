package irvine.oeis.a331;

import irvine.math.group.SymmetricGroup;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.a188.A188445;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A331571 Array read by antidiagonals: A(n,k) is the number of binary matrices with k columns and any number of distinct nonzero rows with n ones in every column and columns in nonincreasing lexicographic order.
 * @author Sean A. Irvine
 */
public class A331571 extends A188445 {

  // After Andrew Howroyd
  {
    setOffset(0);
  }

  private static final Polynomial<Q> XMC = Polynomial.create(Q.NEG_ONE, Q.ONE);
  private static final Polynomial<Q> CPX = RING.onePlusXToTheN(1);
  private int mN = -1;
  private int mM = 0;

  protected Q d(final int[] p, final int n, final int k) {
    final int[] c = new int[n + 1];
    IntegerPartition.toCountForm(p, c);
    final WeighTransformSequence w = new WeighTransformSequence(new FiniteSequence(c));
    for (int j = 0; j < n; ++j) {
      w.next();
    }
    final Z t = w.next();
    return new Q(Binomial.binomial(t.add(k - 1), k), SymmetricGroup.per(c));
  }

  protected Z t(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    final int m = n * k + 1;
    final Polynomial<Q> q = RING.exp(RING.integrate(RING.negate(RING.series(RING.monomial(Q.ONE, n), CMX, m - 1))), m);
    final Polynomial<Q> f = RING.series(RING.serlaplace(RING.series(RING.one(), CPX, m)), XMC, m);
    Q sum = Q.ZERO;
    for (int j = 1; j <= m; ++j) {
      Q s = Q.ZERO;
      final IntegerPartition part = new IntegerPartition(j);
      int[] p;
      while ((p = part.next()) != null) {
        if (isMaxPart(p, n)) {
          s = s.signedAdd((p.length & 1) == 0, d(p, n, k));
        }
      }
      final int jj = j;
      final Q t = Rationals.SINGLETON.sum(j, m, i -> q.coeff(i - jj).multiply(f.coeff(i - 1)));
      sum = sum.add(s.multiply(t));
    }
    return sum.toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
