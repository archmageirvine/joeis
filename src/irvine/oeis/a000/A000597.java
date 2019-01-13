package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000597.
 * @author Sean A. Irvine
 */
public class A000597 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(36, 460, 1065, 603, 75, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
