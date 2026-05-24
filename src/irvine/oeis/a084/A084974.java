package irvine.oeis.a084;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A084971.
 * @author Sean A. Irvine
 */
public class A084974 extends A000040 {

  private static final int HEURISTIC = 50;
  private final TreeMap<Z, CR> mMap = new TreeMap<>();
  private CR mPrev = CR.ONE;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  protected Z select(final Map.Entry<Z, CR> e) {
    return e.getKey();
  }

  @Override
  public Z next() {
    while (mMap.size() < HEURISTIC) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final CR andrica = CR.valueOf(q).sqrt().subtract(CR.valueOf(p).sqrt());
      mMap.values().removeIf(value -> value.compareTo(andrica) < 0);
      mMap.put(p, andrica);
    }
    final Map.Entry<Z, CR> e = mMap.pollFirstEntry();
    if (e.getValue().compareTo(mPrev) > 0) {
      throw new RuntimeException("A previously reported value was incorrect: " + mPrev);
    }
    mPrev = e.getValue();
    if (mVerbose) {
      StringUtils.message(e.getKey() + " " + e.getValue());
    }
    return select(e);
  }
}
