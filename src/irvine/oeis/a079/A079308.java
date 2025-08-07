package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079308 For a partition P of a positive integer, let f(P) be the product of k+1, over all parts k in P. Let a(n,r) be the sum of f(P) over all partitions P of n with smallest part r. Sequence gives table of a(n,r) for 1 &lt;= r &lt;= n, in the order a(1,1); a(2,1), a(2,2); a(3,1), a(3,2), a(3,3); ...
 * @author Sean A. Irvine
 */
public class A079308 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      if (m > n) {
        return Z.ZERO;
      }
      return get(n, m + 1).add(get(n - m, m).multiply(m + 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM).subtract(mB.get(mN, mM + 1));
  }
}
