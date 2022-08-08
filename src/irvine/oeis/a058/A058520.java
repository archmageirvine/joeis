package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058520 Sequences of B-trees of order 3 with n labeled leaves.
 * @author Sean A. Irvine
 */
public class A058520 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> M = Polynomial.create(0, 0, 1, 1);
  private int mN = -1;
  private Polynomial<Z> mB = RING.x();

  @Override
  public Z next() {
    ++mN;
    mB = RING.add(RING.x(), RING.substitute(mB, M, mN));
    return RING.coeff(RING.one(), RING.subtract(RING.one(), mB), mN);
  }
}
