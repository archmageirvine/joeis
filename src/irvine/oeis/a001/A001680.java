package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A001680 The partition function G(n,3).
 * @author Sean A. Irvine
 */
public class A001680 implements Sequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> ARG = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.HALF, new Q(1, 6)));
  private int mN = -1;
  private Z mF = Z.ONE;

  protected Polynomial<Q> polynomial() {
    return ARG;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(polynomial(), mN).coeff(mN).multiply(mF).toZ();
  }
}
