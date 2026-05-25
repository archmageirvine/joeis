package irvine.oeis.a084;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A084976 Values of k that show the slow decrease in the larger values of the Andrica function Af(k) = sqrt(p(k+1)) - sqrt(p(k)), where p(k) denotes the k-th prime.
 * @author Sean A. Irvine
 */
public class A084976 extends A000040 {

  private static final int HEURISTIC = 50;
  private final TreeMap<Long, CR> mMap = new TreeMap<>();
  private CR mPrev = CR.ONE;
  private long mN = 0;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (mMap.size() < HEURISTIC) {
      ++mN;
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final CR andrica = CR.valueOf(q).sqrt().subtract(CR.valueOf(p).sqrt());
      mMap.values().removeIf(value -> value.compareTo(andrica) < 0);
      mMap.put(mN, andrica);
    }
    final Map.Entry<Long, CR> e = mMap.pollFirstEntry();
    if (e.getValue().compareTo(mPrev) > 0) {
      throw new RuntimeException("A previously reported value was incorrect: " + mPrev);
    }
    mPrev = e.getValue();
    if (mVerbose) {
      StringUtils.message(e.getKey() + " " + e.getValue());
    }
    return Z.valueOf(e.getKey());
  }
}
