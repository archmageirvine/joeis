package irvine.oeis.a064;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A064574 Number of partitions of n into parts which are all powers of the same composite.
 * @author Sean A. Irvine
 */
public class A064574 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    long s = 0;
    final Sequence composites = new A002808();
    for (int k = composites.next().intValueExact(); k <= mN; k = composites.next().intValueExact()) {
      ++s;
      Polynomial<Z> prod = RING.one();
      for (int r = 1; r <= mN; r *= k) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(r));
      }
      sum = RING.add(sum, RING.series(RING.one(), prod, mN));
    }
    return sum.coeff(mN).subtract(s);
  }
}

