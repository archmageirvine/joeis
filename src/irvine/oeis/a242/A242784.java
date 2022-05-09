package irvine.oeis.a242;

import irvine.math.MemoryFunction2;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A242784 Number A(n,k) of permutations of [n] avoiding the consecutive step pattern given by the binary expansion of k, where 1=up and 0=down; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A242784 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A242784() {
    super(0, 0, -1);
  }

  /* Maple programs:
    A:= proc(n, k) option remember; local b, m, r, h;
      if k<2 then return 1 fi;
      m:= iquo(k, 2, 'r'); h:= 2^ilog2(k);
      b:= proc(u, o, t) option remember; `if`(u+o=0, 1,
      `if`(t=m and r=0, 0, add(b(u-j, o+j-1, irem(2*t, h)), j=1..u))+
      `if`(t=m and r=1, 0, add(b(u+j-1, o-j, irem(2*t+1, h)), j=1..o)))
      end; forget(b);
      b(n, 0, 0)
    end:
    seq(seq(A(n, d-n), n=0..d), d=0..15);
  */
  // A:= proc(n, k)
  private final MemoryFunction2<Integer, Z> mA = new MemoryFunction2<Integer, Z>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      if (k < 2) {
        return Z.ONE;
      }
      final int m = k / 2;
      final int r = k % 2;
      final int h = Integer.highestOneBit(k);

      final class B extends MemoryFunctionInt3<Z> {
        @Override
        protected Z compute(final int u, final int o, final int t) {
          if (u + o == 0) {
            return Z.ONE;
          }
          Z sum = Z.ZERO;
          if (t != m || r != 0) {
            for (int j = 1; j <= u; ++j) {
              sum = sum.add(get(u - j, o - 1 + j, (2 * t) % h));
            }
          }
          if (t != m || r != 1) {
            for (int j = 1; j <= o; ++j) {
              sum = sum.add(get(u + j - 1, o - j, (2 * t + 1) % h));
            }
          }
          return sum;
        }
      }
      return new B().get(n, 0, 0);
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mA.get(n, k);
  }
}
