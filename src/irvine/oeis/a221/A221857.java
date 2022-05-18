package irvine.oeis.a221;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A221857 Number A(n,k) of shapes of balanced k-ary trees with n nodes, where a tree is balanced if the total number of nodes in subtrees corresponding to the branches of any node differ by at most one; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A221857 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A221857() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    A:= proc(n, k) option remember; local m, r; if n<2 or k=1 then 1
          elif k=0 then 0 else r:= iquo(n-1, k, 'm');
          binomial(k, m)*A(r+1, k)^m*A(r, k)^(k-m) fi
        end:
    seq(seq(A(n, d-n), n=0..d), d=0..12);
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n < 2 || k == 1) {
        return Z.ONE;
      }
      if (k == 0) {
        return Z.ZERO;
      }
      final int r = (n - 1) / k;
      final int m = (n - 1) % k;
      return Binomial.binomial(k, m).multiply(get(r + 1, k).pow(m)).multiply(get(r, k).pow(k - m));
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
