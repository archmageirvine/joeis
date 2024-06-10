package irvine.oeis.a070;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070289 Number of distinct values of multinomial coefficients ( n / (p1, p2, p3, ...) ) where (p1, p2, p3, ...) runs over all partitions of n.
 * @author Sean A. Irvine
 */
public class A070289 extends Sequence0 {

  // After Alois Heinz

  private int mN = -1;

  private final MemoryFunctionInt2<Set<Z>> mB = new MemoryFunctionInt2<Set<Z>>() {
    @Override
    protected Set<Z> compute(final int n, final int m) {
      if (n == 0) {
        return Collections.singleton(Z.ONE);
      }
      if (m < 1) {
        return Collections.emptySet();
      }
      final Set<Z> res = new HashSet<>(mB.get(n, m - 1));
      final Z f = Functions.FACTORIAL.z(m);
      Z g = f;
      for (int j = 1; j <= n / m; ++j, g = g.multiply(f)) {
        for (final Z v : mB.get(n - m * j, m - 1)) {
          res.add(v.multiply(g));
        }
      }
      return res;
    }
  };

  @Override
  public Z next() {
    return Z.valueOf(mB.get(++mN, mN).size());
  }
}
