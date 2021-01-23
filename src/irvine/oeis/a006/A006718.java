package irvine.oeis.a006;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006718 Number of golygons of length 8n.
 * @author Sean A. Irvine
 */
public class A006718 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -8;

  @Override
  public Z next() {
    mN += 8;
    final int c = mN * (mN / 8);
    Polynomial<Z> p1 = RING.one();
    for (int k = 1; k < mN; k += 2) {
      p1 = RING.multiply(p1, RING.onePlusXToTheN(k), c);
    }
    final int d = (mN / 8) * (mN / 2 + 1);
    Polynomial<Z> p2 = RING.one();
    for (int k = 1; k <= mN / 2; ++k) {
      p2 = RING.multiply(p2, RING.onePlusXToTheN(k), d);
    }
    return p1.coeff(c).multiply(p2.coeff(d));
  }
}
