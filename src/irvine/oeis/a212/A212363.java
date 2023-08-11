package irvine.oeis.a212;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A212363 Number A(n,k) of Dyck n-paths all of whose ascents and descents have lengths equal to 1+k*m (m&gt;=0); square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A212363 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A212363() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    A:= proc(n, k) option remember;
      `if`(k=0, 1, `if`(n=0, 1, A(n-1, k)
                   +add(A(j, k)*A(n-k-j, k), j=1..n-k)))
    end:
    seq(seq(A(n, d-n), n=0..d), d=0..15);  
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k == 0 || n == 0) {
        return Z.ONE;
      }
      Z sum = get(n - 1, k);
      final int jmax = n - k;
      for (int j = 1; j <= jmax; ++j) {
        sum = sum.add(get(j, k).multiply(get(n - k - j, k)));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
