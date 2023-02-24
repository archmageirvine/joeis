package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036074 Expansion of e.g.f. exp((exp(p*x) - p - 1)/p + exp(x)) for p=4.
 * @author Sean A. Irvine
 */
public class A036074 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private final Q mP;
  private final Polynomial<Q> mPX;
  private final Polynomial<Q> mP1;
  private int mN = -1;
  private Z mF = Z.ONE;

  protected A036074(final int p) {
    mP = new Q(p);
    mPX = RING.monomial(mP, 1);
    mP1 = RING.monomial(new Q(p + 1), 0);
  }

  /** Construct the sequence. */
  public A036074() {
    this(4);
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> e1 = RING.divide(RING.subtract(RING.exp(mPX, mN), mP1), mP);
    final Polynomial<Q> e2 = RING.add(e1, RING.exp(RING.x(), mN));
    final Polynomial<Q> egf = RING.exp(e2, mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
