package irvine.oeis.a242;

import irvine.math.MemoryFunctionInt4;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A242451 Number T(n,k) of compositions of n in which the minimal multiplicity of parts equals k; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A242451 extends Triangle {

  /* Maple:
    b:= proc(n, i, p, k) option remember; `if`(n=0, p!, `if`(i<1, 0,
           b(n, i-1, p, k) +add(b(n-i*j, i-1, p+j, k)/j!,
           j=max(1, k)..floor(n/i))))
        end:
    T:= (n, k)-> b(n$2, 0, k) -`if`(n=0 and k=0, 0, b(n$2, 0, k+1)):
    seq(seq(T(n, k), k=0..n), n=0..14);
  */
  private final MemoryFunctionInt4<Q> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Q compute(final int n, final int i, final int p, final int k) {
      if (n == 0) {
        return new Q(Functions.FACTORIAL.z(p));
      }
      if (i < 1) {
        return Q.ZERO;
      }
      Q sum = get(n, i - 1, p, k);
      final int jmax = n / i;
      for (int j = Math.max(1, k); j <= jmax; ++j) {
        sum = sum.add(get(n - i * j, i - 1, p + j, k).divide(Functions.FACTORIAL.z(j)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    Q result = mB.get(n, n, 0, k);
    if (n != 0 || k != 0) {
      result = result.subtract(mB.get(n, n, 0, k + 1));
    }
    return result.num();
  }
}
