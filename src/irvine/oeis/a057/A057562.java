package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057562 Number of partitions of n into parts all relatively prime to n.
 * @author Sean A. Irvine
 */
public class A057562 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      if (Functions.GCD.i(k, mN) == 1) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(k), mN);
      }
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}

