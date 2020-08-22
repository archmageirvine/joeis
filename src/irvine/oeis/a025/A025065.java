package irvine.oeis.a025;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025065 Number of palindromic partitions of n.
 * @author Sean A. Irvine
 */
public class A025065 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = Polynomial.create(0, 0, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), RING.multiply(RING.oneMinusXToTheN(1), RING.eta(X2, ++mN)), mN);
  }
}
