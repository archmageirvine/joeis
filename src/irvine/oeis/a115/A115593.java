package irvine.oeis.a115;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A115593 Number of forests of rooted trees with total weight n, where a node at height k has weight 2^k (with root considered to be at height 0).
 * @author Georg Fischer
 */
public class A115593 extends Sequence0 {

  private int mN = -1;

  /* Maple:
    with(numtheory):
    b:= proc(n) local r; `if`(irem(n, 2, 'r')=0, 0, a(r)) end:
    a:= proc(n) option remember; `if`(n=0, 1,
           add(add(d*b(d), d=divisors(j))*a(n-j), j=1..n)/n)
        end:
    seq(a(n), n=1..50);  # _Alois P. Heinz_, May 16 2013
  */
  private Q getB(final int n) {
    final int r = n / 2;
    return ((n & 1) == 0) ? Q.ZERO : mA.get(r);
  }

  private final MemoryFunction1<Q> mA = new MemoryFunction1<Q>() {
    @Override
    protected Q compute(final int n) {
      if (n == 0) {
        return Q.ONE;
      }
      Q sum = Q.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(Rationals.SINGLETON.sumdiv(j, d -> getB(d).multiply(d)).multiply(get(n - j)));
      }
      return sum.divide(n);
    }
  };

  @Override
  public Z next() {
    return mA.get(++mN).num();
  }
}
