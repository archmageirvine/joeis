package irvine.oeis.a008;

import java.util.Arrays;
import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008550 Table T(n,k), <code>n&gt;=0</code> and <code>k&gt;=0,</code> read by antidiagonals: the k-th column given by the k-th Narayana polynomial.
 * @author Sean A. Irvine
 */
public class A008550 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.create(Collections.singletonList(Q.TWO));
  private int mN = -1;
  private int mM = 0;

  private Q t(final int n, final int m) {
    final long n1 = n - 1;
    final Polynomial<Q> u = RING.create(Arrays.asList(Q.ONE, new Q(-2L * n - 2), new Q(n1 * n1)));
    final Polynomial<Q> v = RING.create(Arrays.asList(Q.ONE, new Q(n - 1)));
    final Polynomial<Q> den = RING.add(RING.sqrt(u, m), v);
    return RING.coeff(NUM, den, m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM).toZ();
  }
}
