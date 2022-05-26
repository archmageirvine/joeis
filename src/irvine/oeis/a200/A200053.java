package irvine.oeis.a200;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A200053 Number of -4..4 arrays X (0..n-1) of n elements with zero sum and elements alternately strictly increasing and strictly decreasing.
 * @author Georg Fischer
 */
public class A200053 implements Sequence {

  private int mN;
  private final int mDim;

  /** Construct the sequence. */
  public A200053() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param dim dimension of arrays
   */
  public A200053(final int dim) {
    mN = 0;
    mDim = dim;
  }

  /* Maple:
   T:= proc(a, n, s) option remember;
   if n = 1 then if s = a then 1 else 0 fi
   else
     add(procname(-j, n-1, a-s), j=a+1..4)
   fi
   end proc:
   A:= proc(n)  2*add(T(a, n, 0), a=-4..4) end proc: A(1):= 1:
   seq(A(n), n=1..30);
  */
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<Z>() {
    @Override
    protected Z compute(final int a, final int n, final int s, final int dim) {
      if (n == 1) {
        return s == a ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = a + 1; j <= dim; ++j) {
        sum = sum.add(get(-j, n - 1, a - s, dim));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int a = -mDim; a <= mDim; ++a) {
      sum = sum.add(mB.get(a, mN, 0, mDim).multiply2());
    }
    return sum;
  }
}
