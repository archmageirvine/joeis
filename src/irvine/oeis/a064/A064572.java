package irvine.oeis.a064;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064572 Number of ways to partition n into parts which are all powers of some integer k.
 * @author Sean A. Irvine
 */
public class A064572 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int k = 2; k <= mN; ++k) {
      Polynomial<Z> prod = RING.one();
      for (int r = 1; r <= mN; r *= k) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(r));
      }
      sum = RING.add(sum, RING.series(RING.one(), prod, mN));
    }
    return sum.coeff(mN).subtract(mN - 1);
  }
}

