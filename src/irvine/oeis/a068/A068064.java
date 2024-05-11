package irvine.oeis.a068;

import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068064 a(n) = number of integers k such that palindrome A068062(n) = k + reverse(k).
 * @author Sean A. Irvine
 */
public class A068064 extends Sequence1 {

  private final TreeMap<Long, Integer> mValues = new TreeMap<>();
  private long mN = -1;

  @Override
  public Z next() {
    while (mValues.isEmpty() || mN < mValues.firstKey()) {
      ++mN;
      final long s = mN + Functions.REVERSE.l(mN);
      if (Predicates.PALINDROME.is(10, s)) {
        mValues.merge(s, 1, Integer::sum);
      }
    }
    return Z.valueOf(mValues.pollFirstEntry().getValue());
  }
}

