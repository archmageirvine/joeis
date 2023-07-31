package irvine.oeis.a264;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A264396 Number of partitions of n such that the part sizes occurring in it form an interval that does not start at 1.
 * @author Georg Fischer
 */
public class A264396 extends Sequence1 {

  private int mN = 0;

  /* Maple:
    b:= proc(n, i) option remember; `if`(n=0, `if`(i=0, 0, 1),
          `if`(i<1 or n<i, 0, add(b(n-i*j, i-1), j=1..n/i)))
        end:
    a:= n-> add(b(n, i), i=2..n):
    seq(a(n), n=1..70);  # _Alois P. Heinz_, Nov 29 2015
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return i == 0 ? Z.ZERO : Z.ONE;
      }
      if (i < 1 || n < i) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int jmax = n / i;
      for (int j = 1; j <= jmax; ++j) {
        sum = sum.add(get(n - i * j, i - 1));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 2; i <= mN; ++i) {
      sum = sum.add(mB.get(mN, i));
    }
    return sum;
  }
}
