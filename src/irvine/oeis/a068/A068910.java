package irvine.oeis.a068;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068910 a(n) is the unique k such that palindrome A068065(n) = k + reverse(k).
 * @author Sean A. Irvine
 */
public class A068910 extends Sequence0 {

  private final TreeMap<Long, Integer> mValues = new TreeMap<>();
  private final TreeMap<Long, Long> mK = new TreeMap<>();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      while (mValues.isEmpty() || mN < mValues.firstKey()) {
        ++mN;
        final long s = mN + Functions.REVERSE.l(mN);
        if (LongUtils.isPalindrome(s, 10)) {
          mValues.merge(s, 1, Integer::sum);
          mK.put(s, mN);
        }
      }
      final Map.Entry<Long, Integer> e = mValues.pollFirstEntry();
      if (e.getValue() == 1) {
        return Z.valueOf(mK.get(e.getKey()));
      }
    }
  }
}

