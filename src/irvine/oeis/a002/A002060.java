package irvine.oeis.a002;

import irvine.math.MemoryFunctionInt2;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002060 Number of partitions of an n-gon into (n-5) parts.
 * @author Georg Fischer
 */
public class A002060 implements Sequence {

  private int mN = 6;

  /* Maple:
  V := proc(r, k)
        local a , t;
        a := k-1;
        for t from k-2 to 1 by -1 do
                a := a*(r+t)/(t+2) ;
        end do:
        for t from 3 to k+1 do
                a := a*(r-t)/(k-t+2) ;
        end do:
        a ;
end proc:
A002060 := proc(n)
        V(n, n-5) ;
end proc:
seq(A002060(n), n=7..25) ;
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int r, final int k) {
      Q a = new Q(k - 1);
      for (int t = k - 2; t >= 1; --t) {
        a = a.multiply(new Q(r + t)).divide(new Q(t + 2));
      }
      for (int t = 3; t <= k + 1; ++t) {
        a = a.multiply(new Q(r - t)).divide(new Q(k - t + 2));
      }
      return a.num();
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mB.get(mN, mN - 5);
  }
}
