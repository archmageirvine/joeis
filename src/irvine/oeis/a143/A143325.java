package irvine.oeis.a143;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A143325 Table T(n,k) by antidiagonals. T(n,k) is the number of length n primitive (=aperiodic or period n) k-ary words (n,k &gt;= 1) which are earlier in lexicographic order than any other word derived by cyclic shifts of the alphabet.
 * T(n,k) = Sum_{d|n} k^d * mu(n/d).
 * @author Georg Fischer
 */
public class A143325 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A143325() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Z.valueOf(k).pow(d - 1).multiply(Mobius.mobius(n / d)));
    }
    return sum;
  }
}
