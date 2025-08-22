package irvine.oeis.a079;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079581 Consider pairs (r,s) such that the polynomial (x^r+1) divides (x^s+1) and 1 &lt;= r &lt; s. This sequence gives the s values; A079673 gives the r values.
 * @author Sean A. Irvine
 */
public class A079581 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mS = 3;
  private int mR = 0;

  protected Z select(final int r, final int s) {
    return Z.valueOf(s);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mR >= mS) {
        ++mS;
        mR = 1;
      }
      if (mS % mR == 0 && ((mS / mR) & 1) == 1 && RING.isZero(RING.mod(RING.onePlusXToTheN(mS), RING.onePlusXToTheN(mR)))) {
        return select(mR, mS);
      }
    }
  }
}
