package irvine.oeis.a069;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069999 Number of possible dimensions for commutators of n X n matrices; it is independent of the field. Or, given a partition P = (p_1, p_2, ..., p_m) of n with p_1 &gt;= p_2 &gt;= ... &gt;= p_m, let S(P) = sum_j (2j-1)p_j; then a(n) = number of integers that are an S(P) for some partition.
 * @author Sean A. Irvine
 */
public class A069999 extends Sequence0 {

  // After Alois Heinz

  private int mN = -1;
  private final MemoryFunctionInt2<Set<Long>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Set<Long> compute(final int n, final int m) {
      if (n == 0 || m == 1) {
        return Collections.singleton((long) n);
      }
      final Set<Long> res = new HashSet<>(mB.get(n, m - 1));
      for (final long v : mB.get(n - m, Math.min(n - m, m))) {
        res.add(v + (long) m * m);
      }
      return res;
    }
  };

  @Override
  public Z next() {
    return Z.valueOf(mB.get(++mN, mN).size());
  }
}
