package irvine.oeis.a072;

import java.util.HashMap;
import java.util.Map;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A072940 Integers which have more than one coprime factorization into nonprime powers which sum to the same number.
 * @author Sean A. Irvine
 */
public class A072940 extends Sequence1 {

  private long mN = 30029;
  private final Map<Long, Integer> mCounts = new HashMap<>();

  private boolean search(final long[] d, final int pos, final long prod, final long sum) {
    if (prod == mN) {
      return mCounts.merge(sum, 1, Integer::sum) > 1;
    }
    for (int k = pos; k < d.length; ++k) {
      if (!Predicates.PRIME_POWER.is(d[k]) && d[k] * prod <= mN && Functions.GCD.l(d[k], prod) == 1 && search(d, k + 1, d[k] * prod, sum + d[k])) {
        return true; // A solution was found, no need to search further
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mCounts.clear();
      final long[] d = ZUtils.toLong(Jaguar.factor(++mN).divisorsSorted());
      if (search(d, 1, 1, 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}

