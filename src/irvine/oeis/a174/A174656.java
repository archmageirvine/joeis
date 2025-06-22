package irvine.oeis.a174;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A174656 a(n) counts strict partitions of n into powers of 3^t, 5^f and 7^s with positive exponents t, f and s.
 * @author Sean A. Irvine
 */
public class A174656 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int t = 3; t <= mN; t *= 3) {
      p = RING.multiply(p, RING.onePlusXToTheN(t), mN);
    }
    for (int t = 5; t <= mN; t *= 5) {
      p = RING.multiply(p, RING.onePlusXToTheN(t), mN);
    }
    for (int t = 7; t <= mN; t *= 7) {
      p = RING.multiply(p, RING.onePlusXToTheN(t), mN);
    }
    return p.coeff(mN);
  }
}

