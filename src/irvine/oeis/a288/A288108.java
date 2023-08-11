package irvine.oeis.a288;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A288108 Number T(n,k) of Dyck paths of semilength n such that each level has exactly k peaks or no peaks; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A288108 extends BaseTriangle {

  /** Construct the sequence. */
  public A288108() {
    super();
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, k, j) option remember; `if`(n=j, 1, add(
          b(n-j, k, i)*(binomial(j-1, i-1)+binomial(i, k)
           *binomial(j-1, i-1-k)), i=1..min(j+k, n-j)))
        end:
    T:= (n, k)-> b(n, k$2):
    seq(seq(T(n, k), k=0..n), n=0..14);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int k, final int j) {
      if (n == j) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      final int imax = j + k < n - j ? j + k : n - j;
      for (int i = 1; i <= imax; ++i) {
        sum = sum.add(get(n - j, k, i).multiply(Binomial.binomial(j - 1, i - 1).add(Binomial.binomial(i, k).multiply(Binomial.binomial(j - 1, i - 1 - k)))));
      }
      return sum;
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return n == 0 ? Z.ONE : mB.get(n, k, k);
  }
}
