package irvine.oeis.a008;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008479 Number of numbers &lt;= n with same prime factors as n.
 * @author Sean A. Irvine
 */
public class A008479 extends Sequence1 {

  private final HashMap<List<Z>, Integer> mCounts = new HashMap<>();
  private long mN = 0;

  @Override
  public Z next() {
    final List<Z> primes = Arrays.asList(Jaguar.factor(++mN).toZArray());
    final int res = mCounts.merge(primes, 1, (x, y) -> x + y);
    return Z.valueOf(res);
  }
}
