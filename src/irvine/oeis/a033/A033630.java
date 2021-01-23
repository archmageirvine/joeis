package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033630 Number of partitions of n into distinct divisors of n.
 * @author Sean A. Irvine
 */
public class A033630 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 6) {
      return Z.ONE;
    }
    Polynomial<Z> gf = RING.one();
    for (final Z d : Cheetah.factor(mN).divisors()) {
      gf = RING.multiply(gf, RING.onePlusXToTheN(d.intValue()), mN);
    }
    return gf.coeff(mN);
  }
}
