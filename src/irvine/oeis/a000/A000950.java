package irvine.oeis.a000;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A000950 Number of forests with n nodes and height at most 3.
 * @author Sean A. Irvine
 */
public class A000950 extends A000949 {

  /** Construct the sequence. */
  public A000950() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mS = RING.create(Arrays.asList(Q.ZERO, new Q(super.next())));
  protected Z mF = Z.ONE;

  protected Q nextEgf() {
    final Z t = super.next();
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    mS = RING.add(mS, RING.monomial(new Q(t, mF), mN + 1));
    return RING.exp(mS, mN).coeff(mN);
  }

  @Override
  public Z next() {
    return nextEgf().multiply(mF).toZ();
  }
}
