package irvine.oeis.a085;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.HermitePolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085638 Resultant of the polynomial x^n-1 and the Hermite polynomial H_n(x).
 * @author Sean A. Irvine
 */
public class A085638 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final HermitePolynomials mH = new HermitePolynomials();
  private int mN = 0;

  @Override
  public Z next() {
    return RING.resultant(RING.oneMinusXToTheN(++mN), mH.getValue(mN));
  }
}
