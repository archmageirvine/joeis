package irvine.oeis.a054;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a003.A003030;

/**
 * A054948 Number of labeled semi-strong digraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A054948 extends A003030 {

  /** Construct the sequence. */
  public A054948() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private final Polynomial<Q> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA.add(mN == 0 ? Q.ZERO : new Q(super.next(), mF));
    return RING.exp(mA, mN).coeff(mN).multiply(mF).toZ();
  }
}
