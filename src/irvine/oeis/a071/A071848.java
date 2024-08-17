package irvine.oeis.a071;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071829.
 * @author Sean A. Irvine
 */
public class A071848 extends Sequence1 {

  // After Michael S. Branicky

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final MemoryFunction1<Set<Z>> f = new MemoryFunction1<>() {
      @Override
      protected Set<Z> compute(final int m) {
        if (m == 1) {
          return Collections.singleton(Z.valueOf(mN));
        }
        final Set<Z> out = new HashSet<>();
        for (int j = 1; j <= m / 2; ++j) {
          for (final Z x : get(j)) {
            for (final Z y : get (m - j)) {
              out.add(x.add(y));
              out.add(x.subtract(y));
              out.add(y.subtract(x));
              out.add(x.multiply(y));
              if (!y.isZero() && x.mod(y).isZero()) {
                out.add(x.divide(y));
              }
              if (!x.isZero() && y.mod(x).isZero()) {
                out.add(y.divide(x));
              }
            }
          }
        }
        return out;
      }
    };
    final Set<Z> union = new HashSet<>();
    for (int k = 1; k <= mN; ++k) {
      union.addAll(f.get(k));
    }
    Z res = Z.TWO; // 1 is always possible via 1 or n/n
    while (union.contains(res)) {
      res = res.add(1);
    }
    return res;
  }
}
