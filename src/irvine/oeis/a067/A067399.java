package irvine.oeis.a067;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067399 Number of divisors of n in OR-numbral arithmetic.
 * @author Sean A. Irvine
 */
public class A067399 extends Sequence1 {

  private final TreeMap<Long, Set<Long>> mDivisors = new TreeMap<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 1; k <= mN; ++k) {
      final long t = LongUtils.numbralMultiply(k, mN);
      final Set<Long> ds = mDivisors.computeIfAbsent(t, k1 -> new HashSet<>());
      ds.add(k);
      ds.add(mN);
    }
    return Z.valueOf(mDivisors.pollFirstEntry().getValue().size());
  }
}
