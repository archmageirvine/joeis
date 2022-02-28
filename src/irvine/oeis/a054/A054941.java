package irvine.oeis.a054;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054941 Number of weakly connected oriented graphs on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A054941 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private Z mF = Z.ONE;
  private int mN = 0;
  {
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mA.add(new Q(Z.THREE.pow(mN * (mN - 1L) / 2), mF));
    return RING.log1p(mA, mN).coeff(mN).multiply(mF).toZ();
  }
}
