package irvine.oeis.a183;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A183568 Triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows: T(n,k) is the number of partitions of n containing a clique of size k.
 * @author Georg Fischer
 */
public class A183568 extends Triangle {

  /* Maple:
    b:= proc(n, i, k) option remember;
       print(n, i, k):
      `if`(n=0, [1, 0], `if`(i<1, [0, 0],
      add((l->`if`(j=k, [l[1]$2], l))(b(n-i*j, i-1, k)), j=0..n/i)))
    end:
    T:= (n, k)-> (l-> l[`if`(k=0, 1, 2)])(b(n, n, k)):
    seq(seq(print(n, T(n, k)), k=0..n), n=0..4);
  */
  private final MemoryFunctionInt3<Z[]> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z[] compute(final int n, final int i, final int k) {
      // System.out.println(n + "," + i + "," + k);
      if (n == 0) {
        return new Z[]{Z.ONE, Z.ZERO};
      }
      if (i < 1) {
        return new Z[]{Z.ZERO, Z.ZERO};
      }
      final Z[] sums = {Z.ZERO, Z.ZERO};
      final int jmax = n / i;
      for (int j = 0; j <= jmax; ++j) {
        final Z[] list = get(n - i * j, i - 1, k);
        sums[0] = sums[0].add(list[0]);
        sums[1] = sums[1].add(j == k ? list[0] : list[1]);
      }
      return sums;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    return mB.get(n, n, k)[k == 0 ? 0 : 1];
  }
}
