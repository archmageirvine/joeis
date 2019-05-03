package irvine.oeis.a008;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008705 Coefficient of <code>x^n</code> in <code>(Product_{m=1..n}(1-x^m))^n</code>.
 * @author Sean A. Irvine
 */
public class A008705 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> f = RING.one();
    for (int m = 1; m <= mN; ++m) {
      f = RING.multiply(f, RING.oneMinusXToTheN(m), mN);
    }
    return RING.pow(f, mN, mN).coeff(mN);
  }
}


