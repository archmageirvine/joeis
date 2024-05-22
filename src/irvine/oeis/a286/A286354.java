package irvine.oeis.a286;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A286354 Square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals, where column k is the expansion of Product_{j&gt;=1} (1 - x^j)^k.
 * @author Georg Fischer
 */
public class A286354 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A286354() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    A:= proc(n, k) option remember; `if`(n=0, 1, -k*
          add(numtheory[sigma](j)*A(n-j, k), j=1..n)/n)
        end:
    seq(seq(A(n, d-n), n=0..d), d=0..12);
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(get(n - j, k).multiply(Functions.SIGMA1.z(j)));
      }
      return sum.multiply(-k).divide(n);
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
