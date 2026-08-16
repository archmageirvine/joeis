package irvine.oeis.a292;
// manually 2026-08-16/mtrifun

import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt4;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A292086 Number T(n,k) of (unlabeled) rooted trees with n leaf nodes and without unary nodes such that k
 * is the maximum of 1 and the node outdegrees; triangle T(n,k), n&gt;=1, 1&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A292086 extends BaseTriangle implements DirectArray {

  private int mN;

  /** Construct the sequence. */
  public A292086() {
    super(1, 1, 1);
    mN = 0;
  }

  /* Maple:
     b:= proc(n, i, v, k) option remember; `if`(n=0,
           `if`(v=0, 1, 0), `if`(i<1 or v<1 or n<v, 0,
           `if`(v=n, 1, add(binomial(A(i, k)+j-1, j)*
            b(n-i*j, i-1, v-j, k), j=0..min(n/i, v)))))
         end:
     A:= proc(n, k) option remember; `if`(n<2, n,
           add(b(n, n+1-j, j, k), j=2..min(n, k)))
         end:
     T:= (n, k)-> A(n, k)-`if`(k=1, 0, A(n, k-1)):
     seq(seq(T(n, k), k=1..n), n=1..15);  
  */
  final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int i, final int v, final int k) {
      return n == 0 ? (v == 0 ? Z.ONE : Z.ZERO) : (i < 1 || v < 1 || n < v ? Z.ZERO : (v == n ? Z.ONE : Integers.SINGLETON.sum(0, Functions.MIN.i(n / i, v), j -> Binomial.binomial(mA.get(i, k).add(j - 1), j).multiply(get(n - i * j, i - 1, v - j, k)))));
    }
  };

  final MemoryFunctionInt2<Z> mA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      return n < 2 ? Z.valueOf(n) : Integers.SINGLETON.sum(2, Functions.MIN.i(n, k), j -> mB.get(n, n + 1 - j, j, k));
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return mA.get(n, k).subtract(k == 1 ? Z.ZERO : mA.get(n, k - 1));
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
