package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000110;

/**
 * A001188 Number of even graphs with n edges.
 * @author Sean A. Irvine
 */
public class A001188 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final A000110 mA = new A000110();
  private Polynomial<Q> mSeq = RING.zero();
  private int mN = 0;
  private Z mF = Z.ONE;

  {
    mA.next();
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final Z g = mA.next().square();
    mSeq = RING.add(mSeq, RING.monomial(new Q(g, mF), mN));
    final Polynomial<Q> egf = RING.add(RING.log1p(mSeq, mN), RING.exp(RING.x(), mN));
    return egf.coeff(mN).multiply(mF).toZ().divide2();
  }
}
