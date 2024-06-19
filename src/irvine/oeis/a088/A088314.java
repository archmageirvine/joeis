package irvine.oeis.a088;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A088314 Cardinality of set of sets of parts of all partitions of n.
 * @author Sean A. Irvine
 */
public class A088314 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt2<Set<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Set<Z> compute(final int n, final int m) {
      // Here Z is used as a bitset
      if (n == 0) {
        return Collections.singleton(Z.ZERO);
      }
      if (m < 1) {
        return Collections.emptySet();
      }
      final Set<Z> res = new HashSet<>(get(n, m - 1));
      for (int j = 1; j <= n / m; ++j) {
        for (final Z set : get(n - j * m, m - 1)) {
          res.add(set.setBit(m));
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
