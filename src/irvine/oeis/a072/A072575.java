package irvine.oeis.a072;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072575 Triangle T(n,k) of number of compositions (ordered partitions) of n into distinct parts where largest part is exactly k, 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A072575 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;

  private final MemoryFunctionInt2<List<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected List<Z> compute(final int n, final int m) {
      if (n == 0) {
        return Collections.singletonList(Z.ONE);
      }
      if (m < 1) {
        return Collections.emptyList();
      } else {
        final List<Z> a = get(n, m - 1);
        final List<Z> b = new ArrayList<>();
        if (m <= n) {
          b.add(Z.ZERO);
          b.addAll(get(n - m, m - 1));
        }
        final List<Z> c = new ArrayList<>();
        for (int k = 0; k < Math.max(a.size(), b.size()); ++k) {
          c.add((k < a.size() ? a.get(k) : Z.ZERO).add(k < b.size() ? b.get(k) : Z.ZERO));
        }
        return c;
      }
    }
  };

  private Z t(final int n, final int m) {
    final List<Z> l = mB.get(n - m, m - 1);
    return Integers.SINGLETON.sum(0, l.size() - 1, k -> l.get(k).multiply(Functions.FACTORIAL.z(k + 1)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
