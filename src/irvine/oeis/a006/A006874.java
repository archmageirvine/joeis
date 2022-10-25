package irvine.oeis.a006;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006874 Mu-atoms of period n on continent of Mandelbrot set.
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
      sum = sum.add(get(IntegerUtils.gcd(n, k)));
    }
    return sum;
  }
}
