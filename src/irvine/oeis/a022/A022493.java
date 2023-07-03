package irvine.oeis.a022;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022493 Fishburn numbers: number of linearized chord diagrams of degree n; also number of nonisomorphic interval orders on n unlabeled points.
 * @author Sean A. Irvine
 */
public class A022493 extends Sequence0 {

  // After Alois P. Heinz

  private long mN = -2;
  private final MemoryFunction3<Long, Z> mB = new MemoryFunction3<>() {
    @Override
    protected Z compute(final Long n, final Long k, final Long t) {
      if (n < 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (long j = 0; j <= t + 1; ++j) {
        sum = sum.add(get(n - 1, j, t + (j > k ? 1 : 0)));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, 0L, 0L);
  }
}
