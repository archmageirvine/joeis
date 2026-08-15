package irvine.oeis.a305;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A305962 Number A(n,k) of length-n restricted growth strings (RGS) with growth &lt;= k and fixed first element; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A305962 extends UpperLeftTriangle implements DirectArray {

  /** Construct the sequence. */
  public A305962() {
    super(0, 0, 0, -1);
  }

  /* Maple:
     b:= proc(n, k, m) option remember; `if`(n=0, 1,
           add(b(n-1, k, max(m, j)), j=1..m+k))
         end:
     A:= (n, k)-> b(n, k, 1-k):
     seq(seq(A(n, d-n), n=0..d), d=0..12);
  */
  final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int k, final int m) {
      return n == 0 ? Z.ONE : Integers.SINGLETON.sum(1, m + k, j -> get(n - 1, k, Functions.MAX.i(m, j)));
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k, 1 - k);
  }

  @Override
  public Z a(final long n, final long k) {
    return matrixElement((int) n, (int) k);
  }
}
