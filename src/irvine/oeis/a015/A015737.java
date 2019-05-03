package irvine.oeis.a015;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015737 Number of <code>3</code>'s in partitions of n into distinct parts.
 * @author Sean A. Irvine
 */
public class A015737 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mDen = RING.onePlusXToTheN(target());
  private int mN = 0;

  protected int target() {
    return 3;
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int j = 1; j <= mN; ++j) {
      prod = RING.multiply(prod, RING.onePlusXToTheN(j), mN);
    }
    return RING.coeff(prod.shift(target()), mDen, mN);
  }
}
