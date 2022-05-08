package irvine.oeis.a258;

import irvine.math.z.Z;
import irvine.oeis.triangle.MemoryTriangle;

/**
 * A258829 Number T(n,k) of permutations p of [n] such that the up-down signature of 0,p has nonnegative partial sums with a maximal value of k; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * with a maximal value of k; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A258829 extends MemoryTriangle<Z> {

  /* Maple programs:
    b:= proc(u, o, c, k) option remember;
      `if`(c<0 or c>k, 0, `if`(u+o=0, 1,
       add(b(u-j, o-1+j, c+1, k), j=1..u)+
       add(b(u+j-1, o-j, c-1, k), j=1..o)))
    end:
    A:= (n, k)-> b(n, 0$2, k):
    T:= (n, k)-> A(n, k) -`if`(k=0, 0, A(n, k-1)):
    seq(seq(T(n, k), k=0..n), n=0..12);
  */
  @Override
  protected Z calculate(final int u, final int o, final int c, final int k) {
    if (c < 0 || c > k) {
      return Z.ZERO;
    }
    if (u + o == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= u; ++j) {
      sum = sum.add(retrieve(u - j, o - 1 + j, c + 1, k));
    }
    for (int j = 1; j <= o; ++j) {
      sum = sum.add(retrieve(u + j - 1, o - j, c - 1, k));
    }
    return sum;
  }

  @Override
  protected Z compute(final int n, final int k) {
    return retrieve(n, 0, 0, k).subtract(k == 0 ? Z.ZERO : retrieve(n, 0, 0, k - 1));
  }
}
