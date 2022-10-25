package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a004.A004111;

/**
 * A032176 Functions of n points with no symmetries.
 * @author Sean A. Irvine
 */
public class A032176 extends A004111 {

  // WEIGH transform

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private int mN = -1;
  {
    setOffset(1);
    next();
  }

  @Override
  public Z next() {
    mA.add(super.next());
    return RING.series(RING.subtract(RING.one(), mA.substitutePower(2, ++mN)),
      RING.subtract(RING.one(), mA), mN)
      .coeff(mN);
  }
}
