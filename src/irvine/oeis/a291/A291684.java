package irvine.oeis.a291;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A291684 Number T(n,k) of permutations p of [n] such that 0p has a nonincreasing jump sequence beginning with k; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A291684 extends BaseTriangle implements DirectArray {

  /** Construct the sequence. */
  public A291684() {
    super(0, 0, 0);
  }

  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int u, final int o, final int t) {
      return u + o == 0
        ? Z.ONE
        : Integers.SINGLETON.sum(1, Functions.MIN.i(t, u), j -> get(u - j, o + j - 1, j)).add(
          Integers.SINGLETON.sum(1, Functions.MIN.i(t, o), j -> get(u + j - 1, o - j, j)));
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return mB.get(0, n, k).subtract(k == 0 ? Z.ZERO : mB.get(0, n, k - 1));
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
