package irvine.oeis.a003;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003575 Dowling numbers: e.g.f.: exp(x + (exp(b*x) - 1)/b) with b=3.
 * @author Sean A. Irvine
 */
public class A003575 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Q mQ;
  private final Polynomial<Q> mInner;
  private final Polynomial<Q> mOuter;
  private Z mF = Z.ONE;
  private int mN = -1;

  protected A003575(final long q) {
    mQ = new Q(q);
    mInner = RING.monomial(mQ, 1);
    mOuter = RING.create(Arrays.asList(new Q(-1, q), Q.ONE));
  }

  /** Construct the sequence. */
  public A003575() {
    this(3);
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> e = RING.divide(RING.exp(mInner, mN), mQ);
    final Polynomial<Q> egf = RING.exp(RING.add(mOuter, e), mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
