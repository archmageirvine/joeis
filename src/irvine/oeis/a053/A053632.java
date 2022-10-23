package irvine.oeis.a053;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053632 Irregular triangle read by rows giving coefficients in expansion of Product_{k=1..n} (1 + x^k).
 * @author Sean A. Irvine
 */
public class A053632 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = -1;
  private Polynomial<Z> mA = RING.one();

  @Override
  public Z next() {
    if (++mM > mA.degree()) {
      mA = RING.multiply(mA, RING.onePlusXToTheN(++mN));
      mM = 0;
    }
    return mA.get(mM);
  }
}
