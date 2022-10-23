package irvine.oeis.a048;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048286 Eigensequence of a sequence transformation.
 * @author Sean A. Irvine
 */
public class A048286 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = RING.oneMinusXToTheN(1);
  private static final Polynomial<Z> C2 = RING.pow(C1, 2);
  private static final Polynomial<Z> C3 = RING.onePlusXToTheN(1);
  private Polynomial<Z> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Polynomial<Z> subs = RING.substitute(mA, RING.series(RING.x(), C2, mN), mN);
      mA = RING.subtract(RING.add(RING.one(), RING.series(RING.multiply(subs, C3, mN), C1, mN)), mA);
    }
    return mA.coeff(mN);
  }
}

