package irvine.oeis.a041;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A041004.
 * @author Sean A. Irvine
 */
public class A041004 implements Sequence {

  //private final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final PolynomialRingField<Z> RING = new PolynomialRingField<>(new GaloisField(2));
  private int mN = -1;
  private Polynomial<Z> mA = RING.oneMinusXToTheN(1);
  //private Polynomial<Z> mA = RING.multiply(RING.oneMinusXToTheN(1), RING.oneMinusXToTheN(3));

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    System.out.println("n=" + mN);
    final Polynomial<Z> inv = RING.series(RING.one(), mA, mN + 5);
    System.out.println("inv=" + inv);
    final Z res = inv.coeff(mN).mod(Z.TWO);
    if (!res.isZero() && mN > 2) {
      System.out.println("Multiply in (1-x^" + (mN + 0) + ")");
      mA = RING.multiply(mA, RING.oneMinusXToTheN(mN + 0));
    }
    return res;
  }
}
