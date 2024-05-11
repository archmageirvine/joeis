package irvine.oeis.a068;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068065 Palindromes n for which there is a unique k such that n = k + reverse(k).
 * @author Sean A. Irvine
 */
public class A068065 extends Sequence1 {

  private final TreeMap<Long, Integer> mValues = new TreeMap<>();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      while (mValues.isEmpty() || mN < mValues.firstKey()) {
        ++mN;
        final long s = mN + Functions.REVERSE.l(mN);
        if (Predicates.PALINDROME.is(10, s)) {
          mValues.merge(s, 1, Integer::sum);
        }
      }
      final Map.Entry<Long, Integer> e = mValues.pollFirstEntry();
      if (e.getValue() == 1) {
        return Z.valueOf(e.getKey());
      }
    }
  }
}

