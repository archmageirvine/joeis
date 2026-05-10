package irvine.oeis.a394;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A394948 Number of equivalence classes of well-formed bracketed words of total length 2n built from the symbol * (of length 2) and two unary bracket types () and [], with no empty bracket pair, modulo commutativity of concatenation.
 * @author Sean A. Irvine
 */
public class A394948 extends CachedSequence {

  /** Construct the sequence. */
  public A394948() {
    super(0);
  }

  protected Z b(final long n) {
    return n == 1 ? Z.ONE : a(n - 1).multiply2();
  }

  private Z c(final long n) {
    return Integers.SINGLETON.sumdiv(n, m -> b(m).multiply(m));
  }

  @Override
  protected Z compute(final Z nn) {
    final long n = nn.longValueExact();
    if (n <= 1) {
      return Z.ONE;
    }
    Z sum = c(n);
    for (long k = 1; k < n; ++k) {
      sum = sum.add(c(k).multiply(a(n - k)));
    }
    return sum.divide(n);
  }
}
