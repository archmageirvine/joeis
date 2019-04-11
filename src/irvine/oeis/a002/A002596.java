package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002596 Numerators in expansion of <code>sqrt(1+x).</code> Absolute values give numerators in expansion of <code>sqrt(1-x)</code>.
 * @author Sean A. Irvine
 */
public class A002596 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.sqrt1p(RING.x(), mN).coeff(mN).num();
  }
}
