package irvine.oeis.a056;

import irvine.math.IntegerUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A056971 Number of (binary) heaps on n elements.
 * @author Sean A. Irvine
 */
public class A056971 extends MemorySequence {

  private Z f(final int n, final int f) {
    return a(f).multiply(a(n - 1 - f)).multiply(Binomial.binomial(n - 1, f));
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    final int g = IntegerUtils.nextPowerOf2(n) >>> 1;
    return f(n, Math.min(g - 1, n - g / 2));
  }
}
