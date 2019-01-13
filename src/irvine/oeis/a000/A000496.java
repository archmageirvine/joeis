package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000496.
 * @author Sean A. Irvine
 */
public class A000496 implements Sequence {

  // Conjectured GF due to Plouffe
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(24, -4, -8, -16, -4);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -2, 0, 0, 1);
  private static final Z[] PRETERMS = {Z.ONE, Z.ONE, Z.TWO, Z.SIX};

  private int mN = -5;

  @Override
  public Z next() {
    return ++mN < 0 ? PRETERMS[mN + 4] : RING.coeff(NUM, DEN, mN);
  }
}
