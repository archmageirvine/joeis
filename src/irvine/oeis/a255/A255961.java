package irvine.oeis.a255;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A255961 Square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals, where column k is Euler transform of (j-&gt;j*k).
 * @author Georg Fischer
 */
public class A255961 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A255961() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    A:= proc(n, k) option remember; `if`(n=0, 1, k*add(
          A(n-j, k)*numtheory[sigma][2](j), j=1..n)/n)
        end:
    seq(seq(A(n, d-n), n=0..d), d=0..12);
  */
  private final MemoryFunctionInt2<Z> mA = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(get(n - j, k).multiply(Jaguar.factor(j).sigma2()));
      }
      return sum.multiply(k).divide(n);
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mA.get(n, k);
  }
}
