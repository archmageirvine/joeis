package irvine.oeis.a215;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A215771 Number T(n,k) of undirected labeled graphs on n nodes with exactly k cycle graphs as connected components; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A215771 extends BaseTriangle implements DirectArray {

  /** Construct the sequence. */
  public A215771() {
    super(0, 0, 0);
  }

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
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
