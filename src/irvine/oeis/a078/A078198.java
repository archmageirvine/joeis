package irvine.oeis.a078;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078198 Numbers that cannot be partitioned into distinct powers of 3, 5 and 7, all with positive exponents.
 * @author Sean A. Irvine
 */
public class A078198 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  private boolean is(final int n) {
    Polynomial<Z> p = RING.one();
    for (int t = 3; t <= n; t *= 3) {
      p = RING.multiply(p, RING.onePlusXToTheN(t), n);
      if (!p.coeff(n).isZero()) {
        return false;
      }
    }
    for (int t = 5; t <= n; t *= 5) {
      p = RING.multiply(p, RING.onePlusXToTheN(t), n);
      if (!p.coeff(n).isZero()) {
        return false;
      }
    }
    for (int t = 7; t <= n; t *= 7) {
      p = RING.multiply(p, RING.onePlusXToTheN(t), n);
      if (!p.coeff(n).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

