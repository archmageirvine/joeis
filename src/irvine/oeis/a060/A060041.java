package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A060041 Certain numbers a(n) related to Gromov-Witten invariants N_n in dimension n (see formula (7.45) on p. 202 of Cox and Katz).
 * @author Sean A. Irvine
 */
public class A060041 extends AbstractSequence {

  /** Construct the sequence. */
  public A060041() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> FIVE = Polynomial.create(Q.FIVE);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.ONE, new Q(3125));
  private int mN = -1;

  private Polynomial<Q> reversion(final Polynomial<Q> a, final int degree) {
    final Q c1 = a.coeff(1);
    final Q inverseC1 = c1.reciprocal();
    final Polynomial<Q> w = RING.empty();
    w.add(Q.ZERO);
    w.add(inverseC1);
    final List<Q> aa = new ArrayList<>();
    for (int k = 2; k <= degree; ++k) {
      aa.add(a.get(k).multiply(inverseC1));
    }
    Q invk = inverseC1;
    for (int k = 2; k <= degree; ++k) {
      invk = invk.multiply(inverseC1);
      final IntegerPartition part = new IntegerPartition(k - 1);
      final int[] j = new int[k];
      int[] p;
      Q term = Q.ZERO;
      while ((p = part.next()) != null) {
        IntegerPartition.toCountForm(p, j);
        final int sum = (int) IntegerUtils.sum(j);
        Q prod = Q.ONE;
        for (int i = 1; i < j.length; ++i) {
          if (j[i] > 0) {
            prod = prod.multiply(aa.get(i - 1).pow(j[i])).divide(Functions.FACTORIAL.z(j[i]));
          }
        }
        Z pr = Z.ONE;
        for (int u = k; u < k + sum; ++u) {
          pr = pr.multiply(u);
        }
        prod = prod.multiply(pr);
        term = term.signedAdd((sum & 1) == 0, prod);
      }
      w.add(term.multiply(invk).divide(k));
    }
    return w;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.FIVE;
    }
    final Q[] c1 = new Q[mN + 1];
    for (int k = 0; k < c1.length; ++k) {
      final Q t = new Q(Functions.FACTORIAL.z(5 * k), Functions.FACTORIAL.z(k).pow(5));
      c1[k] = (k & 1) == 0 ? t : t.negate();
    }
    final Polynomial<Q> a1 = Polynomial.create(c1);
    final Q[] c2 = new Q[mN + 1];
    for (int k = 0; k < c2.length; ++k) {
      final Q t0 = Rationals.SINGLETON.sum(k + 1, 5 * k, j -> new Q(1, j));
      final Q t = t0.multiply(new Q(Functions.FACTORIAL.z(5 * k), Functions.FACTORIAL.z(k).pow(5)));
      c2[k] = (k & 1) == 0 ? t : t.negate();
    }
    final Polynomial<Q> a2a = RING.multiply(Polynomial.create(c2), Q.FIVE);
    final Polynomial<Q> a2 = RING.negate(RING.exp(RING.series(a2a, a1, mN), mN)).shift(1);
    final Polynomial<Q> a2d = RING.pow(RING.series(RING.diff(a2).shift(1), a2, mN), 3, mN);
    final Polynomial<Q> a3a = RING.series(FIVE, RING.multiply(RING.multiply(RING.multiply(a1, a1, mN), a2d, mN), C1, mN), mN);
    final Polynomial<Q> a3 = RING.substitute(a3a, reversion(a2, mN), mN);
    return Rationals.SINGLETON.sumdiv(mN, k -> a3.coeff(k).multiply(Functions.MOBIUS.i((long) (mN / k)))).divide(mN).divide(mN).divide(mN).toZ();
  }
}
