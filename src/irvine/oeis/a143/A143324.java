package irvine.oeis.a143;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A143324 Table T(n,k) by antidiagonals. T(n,k) is the number of length n primitive (=aperiodic or period n) k-ary words (n,k &gt;= 1).
 * T(n,k) = Sum_{d|n} k^d * mu(n/d).
 * @author Georg Fischer
 */
public class A143324 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A143324() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Z.valueOf(k).pow(d).multiply(Functions.MOBIUS.i(n / d)));
    }
    return sum;
  }
}
