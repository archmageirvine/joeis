package irvine.oeis.a180;

import irvine.math.z.Z;
import irvine.oeis.memory.FunctionInt3ZSequence;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A180281 Triangle read by rows: T(n,k) = number of arrangements of n indistinguishable balls in n boxes with the maximum number of balls in any box equal to k.
 * with the maximum number of balls in any box equal to k.
 * @author Georg Fischer
 */
public class A180281 extends BaseTriangle {

  /** Construct the sequence. */
  public A180281() {
    super(1, 1, 1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0, 1,
          `if`(i=0, 0, add(b(n-j, i-1, k), j=0..min(n, k))))
        end:
    T:= (n, k)-> b(n$2, k)-b(n$2, k-1):
    seq(seq(T(n,k), k=1..n), n=1..12);  # _Alois P. Heinz_, Aug 16 2018
  */
  private final FunctionInt3ZSequence mB = new FunctionInt3ZSequence(1) {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i == 0) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int maxj = n < k ? n : k;
      for (int j = 0; j <= maxj; ++j) {
        sum = sum.add(get(n - j, i - 1, k));
      }
      return sum;
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return mB.get(n, n, k).subtract(mB.get(n, n, k - 1));
  }
}
