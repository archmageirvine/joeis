package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a052.A052894;

/**
 * A000763 Number of interval orders constructed from n intervals of generic lengths.
 * @author Sean A. Irvine
 */
public class A000763 extends AbstractSequence {

  private final A052894 mSeq1 = new A052894();

  /** Construct the sequence. */
  public A000763() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private final ArrayList<Q> mCoeff = new ArrayList<>();
  private Z mF = Z.ONE;
  private int mN = 0;

  {
    mCoeff.add(new Q(mSeq1.next()));
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mCoeff.add(new Q(mSeq1.next(), mF));
    final Polynomial<Q> rootSquared = RING.pow(RING.create(mCoeff), 2, mN);
    final Polynomial<Q> integral = RING.integrate(rootSquared);
    final Polynomial<Q> egf = RING.exp(integral, mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
