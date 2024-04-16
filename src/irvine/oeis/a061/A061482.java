package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A061482 a(1) = 1, a(2) = 2, a(n) = sum of products of previous terms taking n-2 at a time.
 * @author Sean A. Irvine
 */
public class A061482 extends MemorySequence {

  {
    setOffset(1);
  }

  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return n == 0 ? Z.ONE : Z.TWO;
    }
    Z sum = Z.ZERO;
    final long lim = 1L << n;
    for (long s = (1L << (n - 1)) - 1; s < lim; s = Functions.SWIZZLE.l(s)) {
      long t = s;
      Z prod = Z.ONE;
      int k = 0;
      while (t != 0) {
        if ((t & 1) == 1) {
          prod = prod.multiply(a(k));
        }
        ++k;
        t >>>= 1;
      }
      sum = sum.add(prod);
    }
    return sum;
  }
}

