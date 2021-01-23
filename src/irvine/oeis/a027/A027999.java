package irvine.oeis.a027;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027999 Expansion of Product(1+q^m)^(m(m-1)/2); m=1..inf.
 * @author Sean A. Irvine
 */
public class A027999 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> gf = RING.one();
    for (int k = 2; k <= mN; ++k) {
      gf = RING.multiply(gf, RING.pow(RING.onePlusXToTheN(k), k * (k - 1) / 2, mN), mN);
    }
    return gf.coeff(mN);
  }
}
