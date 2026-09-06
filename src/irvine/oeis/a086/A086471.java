package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A086471 Product of distinct (smallest) prime signature divisors. In case of two or more divisors with the same prime signature the smallest is considered to evaluate the product.
 * @author Sean A. Irvine
 */
public class A086471 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    final HashSet<Z> seen = new HashSet<>();
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      if (seen.add(FactorUtils.leastPrimeSignature(d))) {
        prod = prod.multiply(d);
      }
    }
    return prod;
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}

