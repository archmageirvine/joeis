package irvine.oeis.a286;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A286744 Number of distinct partitions of n with parts differing by at least two with smallest part at least two and with an even number of parts.
 * @author Georg Fischer
 */
public class A286744 extends Sequence0 {

  private int mN = -1;

  /* Maple:
    b:= proc(n, i, t) option remember; `if`(n=0, t,
          `if`(i>n, 0, b(n, i+1, t)+b(n-i, i+2, 1-t)))
        end:
    a:= n-> b(n, 2, 1):
    seq(a(n), n=0..80);  # _Alois P. Heinz_, Nov 23 2017
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int t) {
      if (n == 0) {
        return Z.valueOf(t);
      }
      if (i > n) {
        return Z.ZERO;
      }
      return get(n, i + 1, t).add(get(n - i, i + 2, 1 - t));
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 2, 1);
  }
}
