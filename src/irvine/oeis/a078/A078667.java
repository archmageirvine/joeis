package irvine.oeis.a078;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078667 Integers that occur more than once as the difference of the squares of two consecutive primes.
 * @author Sean A. Irvine
 */
public class A078667 extends A000040 {

  private final TreeMap<Z, Integer> mCounts = new TreeMap<>();
  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      while (mCounts.isEmpty() || mCounts.firstKey().compareTo(mP.add(2).square().subtract(mP.square())) >= 0) {
        final Z t = mP;
        mP = super.next();
        final Z d = mP.square().subtract(t.square());
        mCounts.merge(d, 1, Integer::sum);
      }
      final Map.Entry<Z, Integer> e = mCounts.pollFirstEntry();
      if (e.getValue() > 1) {
        return e.getKey();
      }
    }
  }
}

