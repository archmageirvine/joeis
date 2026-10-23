package irvine.oeis.a256;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A256130 Number T(n,k) of partitions of n into parts of exactly k sorts which are introduced in ascending order; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A256130 extends BaseTriangle implements DirectArray {

  /** Construct the sequence. */
  public A256130() {
    super(0, 0, 0);
  }

  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z result = get(n, i - 1, k);
      if (i <= n) {
        result = result.add(get(n - i, i, k).multiply(k));
      }
      return result;
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return Rationals.SINGLETON.sum(0, k, i -> new Q(mB.get(n, n, k - i).multiply((i & 1) == 0 ? 1 : -1),
      Functions.FACTORIAL.z(i).multiply(Functions.FACTORIAL.z(k - i)))).num();
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
