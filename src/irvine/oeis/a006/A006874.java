package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A006874 Number of mu-atoms of period n on continent of Mandelbrot set.
 * @author Sean A. Irvine
 */
public class A006874 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      sum = sum.add(a(Functions.GCD.i(n, k)));
    }
    return sum;
  }
}
