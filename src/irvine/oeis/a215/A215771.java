package irvine.oeis.a215;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A215771 Number T(n,k) of undirected labeled graphs on n nodes with exactly k cycle graphs as connected components;
 * triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A215771 extends BaseTriangle implements DirectArray {

  private int mN;

  /** Construct the sequence. */
  public A215771() {
    super(0, 0, 0);
    mN = -1;
  }

  /* Maple:
     T:= proc(n, k) option remember; `if`(k<0 or k>n, 0, `if`(n=0, 1,
           add(binomial(n-1, i)*T(n-1-i, k-1)*ceil(i!/2), i=0..n-k)))
         end:
     seq(seq(T(n, k), k=0..n), n=0..12);
  */
  final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      return k < 0 || k > n ? Z.ZERO : n == 0 ? Z.ONE : Integers.SINGLETON.sum(0, n - k, i ->
        Binomial.binomial(n - 1, i).multiply(get(n - 1 - i, k - 1)).multiply(i <= 1 ? Z.ONE : Functions.FACTORIAL.z(i).divide2()));
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return mB.get(n, k);
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
