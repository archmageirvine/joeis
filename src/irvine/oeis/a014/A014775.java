package irvine.oeis.a014;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014775 Expansion of exp <code>( - x - (1/2)*x^2 - (1/6)*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A014775 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.ZERO, Q.NEG_ONE, new Q(-1, 2), new Q(-1, 6)));

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(A, mN).coeff(mN).multiply(mF).toZ();
  }
}
