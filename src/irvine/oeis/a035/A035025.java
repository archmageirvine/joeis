package irvine.oeis.a035;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035025 Constant term of (normalized Delta)^(-n).
 * @author Sean A. Irvine
 */
public class A035025 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.pow(RING.eta(RING.x(), mN), 24, mN);
    return RING.coeff(RING.one(), RING.pow(eta, mN, mN), mN);
  }
}
