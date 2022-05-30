package irvine.oeis.a250;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A250261 Number A(n,k) of permutations p of [n] such that p(i) &gt; p(i+1) iff i = 1 + k*m for some m &gt;= 0; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A250261 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A250261() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(u, o, t, k) option remember; `if`(u+o=0, 1,
         `if`(t=1, add(b(u-j, o+j-1, irem(t+1, k), k), j=1..u),
                   add(b(u+j-1, o-j, irem(t+1, k), k), j=1..o)))
        end:
    A:= (n, k)-> b(0, n, 0, `if`(k=0, n, k)):
    seq(seq(A(n, d-n), n=0..d), d=0..14);
  */
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<Z>() {
    @Override
    protected Z compute(final int u, final int o, final int t, final int k) {
      if (u + o == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      if (t == 1) {
        for (int j = 1; j <= u; ++j) {
          sum = sum.add(get(u - j, o + j - 1, (t + 1) % k, k));
        }
      } else {
        for (int j = 1; j <= o; ++j) {
          sum = sum.add(get(u + j - 1, o - j, (t + 1) % k, k));
        }
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(0, n, 0, k == 0 ? n : k);
  }
}
