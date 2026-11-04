package irvine.oeis.a008;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A008479 Number of numbers &lt;= n with same prime factors as n.
 * @author Sean A. Irvine
 */
public class A008479 extends Sequence1 implements DirectSequence {

  private final HashMap<List<Z>, Integer> mCounts = new HashMap<>();
  private long mN = 0;

  @Override
  public Z next() {
    final List<Z> primes = Arrays.asList(Jaguar.factor(++mN).toZArray());
    final int res = mCounts.merge(primes, 1, Integer::sum);
    if (res <= 0) {
      throw new UnsupportedOperationException("Integer count overflow");
    }
    return Z.valueOf(res);
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    final Z[] ps = Jaguar.factor(n).toZArray();
    final MemoryFunction2<Z, Z> g = new MemoryFunction2<>() {
      @Override
      protected Z compute(final Z x, final Z m) {
        if (x.isOne()) {
          return Z.ZERO;
        }
        if (m.isZero()) {
          return Z.valueOf(Functions.FLOOR_LOG.i(x, ps[0]));
        }
        final long end = Functions.FLOOR_LOG.i(x, ps[m.intValue()]);
        final Z m1 = m.subtract(1);
        return Integers.SINGLETON.sum(1, end, i -> get(x.divide(ps[m.intValue()].pow(i)), m1));
      }
    };
    return g.get(n, Z.valueOf(ps.length - 1));
  }
}
