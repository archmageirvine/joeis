package irvine.oeis.a318;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A318753 Number A(n,k) of rooted trees with n nodes such that no more than k subtrees extending from the same node have the same number of nodes; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A318753 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A318753() {
    super(0, 0, -1);
    hasRAM(false);
  }

  /* Maple: A318753
    g:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0, add(
      binomial(A(i, k)+j-1, j)*g(n-i*j, i-1, k), j=0..min(k, n/i))))
    end:
    A:= (n, k)-> g(n-1$2, k):
    seq(seq(A(n, d-n), n=0..d), d=0..14);
    A318754:
    g:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0, add(
          binomial(g(i-1$2, k)+j-1, j)*g(n-i*j, i-1, k), j=0..min(k, n/i))))
        end:
    T:= (n, k)-> g(n-1$2, k) -`if`(k=0, 0, g(n-1$2, k-1)):
    seq(seq(T(n, k), k=0..n-1), n=1..14);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int ni = n / i;
      final int jmax = k < ni ? k : ni;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(Binomial.binomial(get(i - 1, i - 1, k).add(j - 1), Z.valueOf(j)).multiply(super.get(n - i * j, i - 1, k)));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n - 1, n - 1, k);
  }
}
