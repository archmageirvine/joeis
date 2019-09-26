package irvine.oeis.a026;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026374.
 * @author Sean A. Irvine
 */
public class A026374 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> EVEN = Polynomial.create(1, 3, 1);
  private Polynomial<Z> mGfRow = RING.zero();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mGfRow.degree()) {
      mM = 0;
      mGfRow = RING.pow(EVEN, mN / 2);
      if ((++mN & 1) == 1) {
        mGfRow = RING.multiply(mGfRow, RING.onePlusXToTheN(1));
      }
    }
    return mGfRow.coeff(mM);
  }
}
