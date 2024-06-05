package irvine.oeis.a324;

import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A324162 Number T(n,k) of set partitions of [n] where each subset is again partitioned into k nonempty subsets; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A324162 extends Triangle {

  /** Construct the sequence. */
  public A324162() {
    hasRAM(true);
  }

  /* Maple:
    T:= proc(n, k) option remember; `if`(n=0, 1, `if`(k=0, 0, add(
          T(n-j, k)*binomial(n-1, j-1)*Stirling2(j, k), j=k..n)))
        end:
    seq(seq(T(n, k), k=0..n), n=0..12);
  */
  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (k == 0) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = k; j <= n; ++j) {
        sum = sum.add(get(n - j, k).multiply(Binomial.binomial(n - 1, j - 1)).multiply(Functions.STIRLING2.z(j, k)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    return mB.get(n, k);
  }
}
