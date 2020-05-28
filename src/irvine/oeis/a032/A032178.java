package irvine.oeis.a032;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A032178 Functions of n points with no fixed points and with no symmetries.
 * @author Sean A. Irvine
 */
public class A032178 extends A032177 {

  // WEIGH transform

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.create(Collections.emptyList());
  private int mN = 0;
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    mA.add(super.next());
    return RING.series(RING.subtract(RING.one(), mA.substitutePower(2, ++mN)),
      RING.subtract(RING.one(), mA), mN)
      .coeff(mN);
  }
}
