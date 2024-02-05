package irvine.oeis.a092;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A092269 Spt function: total number of smallest parts (counted with multiplicity) in all partitions of n.
 * @author Georg Fischer
 */
public class A092269 extends Sequence1 {

  private int mN = 0;

  /* Maple:
    b:= proc(n, i) option remember; `if`(n=0 or i=1, n,
          `if`(irem(n, i, 'r')=0, r, 0)+add(b(n-i*j, i-1), j=0..n/i))
        end:
    a:= n-> b(n, n):
    seq(a(n), n=1..60);  # Alois P. Heinz, Jan 16 2013
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0 || i == 1) {
        return Z.valueOf(n);
      }
      Z sum = (n % i == 0) ? Z.valueOf(n / i) : Z.ZERO;
      final int jmax = n / i;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(get(n - i * j, i - 1));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mB.get(mN, mN);
  }
}
