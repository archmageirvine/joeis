package irvine.oeis.a107;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A107428 Number of gap-free compositions of n.
 * @author Georg Fischer
 */
public class A107428 extends Sequence1 {
  /* Maple:
    b:= proc(n, i, t) option remember; `if`(n=0, t!,
          `if`(i<1 or n<i, 0, add(b(n-i*j, i-1, t+j)/j!, j=1..n/i)))
        end:
    a:= n-> add(b(n, i, 0), i=1..n):
    seq(a(n), n=1..40);  # _Alois P. Heinz_, Apr 14 2014
  */
  private int mN = 0;

  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int t) {
      if (n == 0) {
        return Functions.FACTORIAL.z(t);
      }
      if (i < 1 || n < i) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int jmax = n / i;
      for (int j = 1; j <= jmax; ++j) {
        sum = sum.add(get(n - i * j, i - 1, t + j).divide(Functions.FACTORIAL.z(j)));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 1; i <= mN; ++i) {
      sum = sum.add(mB.get(mN, i, 0));
    }
    return sum;
  }
}
