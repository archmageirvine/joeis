package irvine.oeis.a365;

import irvine.math.MemoryFunction3;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.triangle.DirectArray;

/**
 * A365676 Triangle read by rows: T(n, k) is the number of partitions of n having exactly k distinct part sizes, for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A365676 extends Sequence0 implements DirectArray {

  private long mN = -1;
  private long mM = 0;

  /* Maple:
     P := proc(n, k, r) option remember; local j;  # after Amir Livne Bar-on
       if n = 0 then return ifelse(k = 0, 1, 0) fi;
       if k = 0 or r = 0 then return 0 fi;
       add(P(n - r * j, k - 1, r - 1), j = 1..iquo(n, r)) + P(n, k, r - 1) end:
     A365676row := n -> local k; seq(P(n, k, n), k = 0..n):
  */
  private final MemoryFunction3<Long, Z> mB = new MemoryFunction3<>() {
    @Override
    protected Z compute(final Long n, final Long k, final Long r) {
      if (n == 0) {
        return k == 0 ? Z.ONE : Z.ZERO;
      }
      if (k == 0 || r == 0) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sum(1, n / r, j -> get(n - r * j, k - 1, r - 1)).add(get(n, k, r - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM, mN);
  }


  @Override
  public Z a(final long n, final long k) {
    return n == 0 ? Z.ONE : mB.get(n, k, n);
  }

}
