package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A054725 a(1)=1; a(n)= sum(p \ n, a(p-1)), where sum is over all primes p that divide n, with multiplicity.
 * @author Sean A. Irvine
 */
public class A054725 extends MemorySequence {

  {
    add(null); // 0 unused
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(n);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(get(p.intValue() - 1).multiply(fs.getExponent(p)));
    }
    return sum;
  }
}
