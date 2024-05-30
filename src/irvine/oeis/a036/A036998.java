package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036998 The number of decompositions of n into different parts relatively prime to n.
 * @author Sean A. Irvine
 */
public class A036998 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1) {
        prod = RING.multiply(prod, RING.onePlusXToTheN(k), mN);
      }
    }
    return prod.coeff(mN);
  }
}
