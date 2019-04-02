package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000251 Number of trees of diameter 6.
 * @author Sean A. Irvine
 */
public class A000251 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final A000065 mR2 = new A000065();
  private final A000235 mR3 = new A000235();
  private final A000041 mS2 = new A000041();
  private Polynomial<Z> mPR2 = RING.zero();
  private Polynomial<Z> mPR3 = RING.zero();
  private Polynomial<Z> mPS2 = RING.zero();
  private int mN = 0;

  @Override
  public Z next() {
    do {
      mPR2 = RING.add(mPR2, RING.monomial(mR2.next(), mN));
      mPR3 = RING.add(mPR3, RING.monomial(mR3.next(), mN));
      mPS2 = RING.add(mPS2, RING.monomial(mS2.next(), mN + 1));
    } while (++mN < 7);
    return RING.subtract(mPR3, RING.multiply(mPR2, mPS2, mN)).coeff(mN - 1);
  }
}
