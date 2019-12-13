package irvine.oeis.a027;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027998 Expansion of <code>Product_{m&gt;=1} (1+q^m)^(m^2)</code>.
 * @author Sean A. Irvine
 */
public class A027998 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> gf = RING.one();
    for (int k = 1; k <= mN; ++k) {
      gf = RING.multiply(gf, RING.pow(RING.onePlusXToTheN(k), k * k, mN), mN);
    }
    return gf.coeff(mN);
  }
}
