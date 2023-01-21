package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A064045 Square array read by antidiagonals of number of length 2k walks on an n-dimensional hypercubic lattice starting and finishing at the origin and staying in the nonnegative part.
 * @author Georg Fischer
 */
public class A064045 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A064045() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    a:= proc(n, k) option remember; `if`(n=0, `if`(k=0, 1, 0),
           add(binomial(2*k, 2*j)*binomial(2*j, j)/
           (j+1)*a(n-1, k-j), j=0..k))
        end:
    seq(seq(a(n, d-n), n=0..d), d=0..12);  # _Alois P. Heinz_, May 06 2014
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return k == 0 ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = 0; j <= k; ++j) {
        sum = sum.add(Binomial.binomial(2 * k, 2 * j).multiply(Binomial.binomial(2 * j, j)).multiply(get(n - 1, k - j)).divide(j + 1));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
