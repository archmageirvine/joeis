package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A000740 Number of 2n-bead balanced binary necklaces of fundamental period 2n, equivalent to reversed complement; also Dirichlet convolution of b_n=2^(n-1) with mu(n); also number of components of Mandelbrot set corresponding to Julia sets with an attractive n-cycle.
 * @author Sean A. Irvine
 */
public class A000740 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z s = Z.ONE.shiftLeft(n - 1);
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d != n) {
        s = s.subtract(a(d));
      }
    }
    return s;
  }
}
