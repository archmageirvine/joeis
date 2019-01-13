package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000163.
 * @author Sean A. Irvine
 */
public class A000163 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final A000084 mS84 = new A000084();
  private Polynomial<Z> mS = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    mS = RING.add(mS, RING.monomial(mS84.next(), ++mN + 1));
    final Polynomial<Z> den = RING.pow(RING.subtract(RING.one(), mS), 3, mN);
    return RING.coeff(RING.add(mS, RING.one()), den, mN).multiply2();
  }
}

