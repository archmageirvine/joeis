package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003438.
 * @author Sean A. Irvine
 */
public class A003438 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 103, 4306, 63110, 388615, 1115068, 1575669, 1115068, 388615, 63110, 4306, 103, 1);
  private static final Polynomial<Z> DEN = RING.pow(RING.oneMinusXToTheN(1), 17);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }

}

