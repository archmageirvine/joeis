package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000985 Number of n X n symmetric matrices with nonnegative entries and all row sums 2.
 * @author Sean A. Irvine
 */
public class A000985 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;
  private final ArrayList<Q> mCache1 = new ArrayList<>();
  private final ArrayList<Q> mCache2 = new ArrayList<>();

  protected A000985(final Q q0, final Q q1, final Q q2) {
    mCache2.add(q0);
    mCache2.add(q1);
    mCache2.add(q2);
  }

  /** Construct the sequence. */
  public A000985() {
    this(Q.ZERO, Q.HALF, new Q(3, 4));
  }

  private Polynomial<Q> oneOverSqrtOneMinusX(final int n) {
    while (mCache1.size() <= n) {
      final int k = mCache1.size();
      mCache1.add(new Q(Binomial.binomial(2 * k, k), Z.ONE.shiftLeft(2 * k)));
    }
    return RING.create(mCache1);
  }

  private Polynomial<Q> innerExpSeries(final int n) {
    while (mCache2.size() <= n) {
      mCache2.add(Q.HALF);
    }
    return RING.create(mCache2);
  }

  private Polynomial<Q> expSeries(final int n) {
    return RING.exp(innerExpSeries(n), n);
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.multiply(oneOverSqrtOneMinusX(mN), expSeries(mN), mN).coeff(mN).multiply(mF).toZ();
  }
}

