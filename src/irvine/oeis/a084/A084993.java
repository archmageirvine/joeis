package irvine.oeis.a084;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A084993 Total number of parts in all partitions of n into prime parts.
 * @author Sean A. Irvine
 */
public class A084993 extends Sequence1 {

  // After Alois P. Heinz

  private static final Pair<Z, Z> ZERO = new Pair<>(Z.ZERO, Z.ZERO);
  private int mN = 0;
  private int mPi = 0;
  private final MemoryFunctionInt2<Pair<Z, Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Pair<Z, Z> compute(final int n, final int m) {
      if (n == 0) {
        return new Pair<>(Z.ONE, Z.ZERO);
      }
      if (m < 1) {
        return ZERO;
      }
      if (m == 1) {
        return (n & 1) == 0 ? new Pair<>(Z.ONE, Z.valueOf(n / 2)) : ZERO;
      }
      final int p = Functions.PRIME.i(m);
      final Pair<Z, Z> g = p > n ? ZERO : get(n - p, m);
      final Pair<Z, Z> b = get(n, m - 1);
      return new Pair<>(b.left().add(g.left()), b.right().add(g.right()).add(g.left()));
    }
  };

  @Override
  public Z next() {
    if (Predicates.PRIME.is(++mN)) {
      ++mPi;
    }
    return mB.get(mN, mPi).right();
  }
}
