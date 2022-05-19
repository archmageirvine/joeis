package irvine.oeis.a204;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204459 Square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals: A(n,k) is the number of k-element subsets that can be chosen from {1,2,...,k*n} having element sum k*(k*n+1)/2.
 * @author Georg Fischer
 */
public class A204459 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A204459() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, t) option remember;
          `if`(i<t or n<t*(t+1)/2 or n>t*(2*i-t+1)/2, 0,
          `if`(n=0, 1, b(n, i-1, t) +`if`(n<i, 0, b(n-i, i-1, t-1))))
        end:
    A:= proc(n, k) local s; s:= k*(k*n+1);
          `if`(k=0, 1, `if`(n=0 or irem(s, 2)=1, 0, b(s/2, k*n, k)))
        end:
    seq(seq(A(n, d-n), n=0..d), d=0..15);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int t) {
      if (i < t || n < t * (t + 1) / 2 || n > t * (2 * i - t + 1) / 2) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = get(n, i - 1, t);
      if (n >= i) {
        sum = sum.add(get(n - i, i - 1, t - 1));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    if (k == 0) {
      return Z.ONE;
    }
    final int s = k * (k * n + 1);
    if (n == 0 || (s & 1) == 1) {
      return Z.ZERO;
    }
    return mB.get(s / 2, k * n, k);
  }
}
