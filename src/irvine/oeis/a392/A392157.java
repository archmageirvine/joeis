package irvine.oeis.a392;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392157 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A392157 extends A000040 {

  private final HashMap<Long, Integer> mCounts = new HashMap<>();

  private long count(final long p) {
    if (p < 10) {
      mCounts.put(p, 1);
      return 1;
    }
    final String s = String.valueOf(p);
    int cnt = 0;
    for (int k = 0; k < s.length(); ++k) {
      final long q = Long.parseLong(s.substring(0, k) + s.substring(k + 1));
      if (mPrime.isPrime(q)) {
        cnt += mCounts.get(q);
      }
    }
    mCounts.put(p, cnt);
    return cnt;
  }

  @Override
  public Z next() {
    return Z.valueOf(count(super.next().longValueExact()));
  }
}
