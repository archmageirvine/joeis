package irvine.oeis.a027;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027906 Expansion of Product_{m&gt;=1} (1+q^m)^(4*m).
 * @author Sean A. Irvine
 */
public class A027906 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> gf = RING.one();
    for (int k = 1; k <= mN; ++k) {
      gf = RING.multiply(gf, RING.pow(RING.onePlusXToTheN(k), 4 * k, mN), mN);
    }
    return gf.coeff(mN);
  }
}
