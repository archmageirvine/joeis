package irvine.oeis.a048;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A048528 Primes expressible in two ways as the sum of an integer and its digit sum.
 * @author Sean A. Irvine
 */
public class A048528 extends Sequence1 {

  // Based on A048521.

  private final TreeMap<Z, Long> mA = new TreeMap<>();
  private Z mP = Z.ONE;

  private boolean isMoreNeeded() {
    if (mA.isEmpty()) {
      return true;
    }
    final int l = mA.firstKey().toString().length();
    final int m = mP.toString().length();
    final int r = mP.add(9 * m).toString().length();
    return l >= r;
  }

  @Override
  public Z next() {
    while (true) {
      while (isMoreNeeded()) {
        final Z q = mP.add(ZUtils.digitSum(mP));
        if (q.isProbablePrime()) {
          final Long v = mA.putIfAbsent(q, 1L);
          if (v != null) {
            mA.put(q, v + 1);
          }
        }
        mP = mP.add(1);
      }
      final Map.Entry<Z, Long> e = mA.pollFirstEntry();
      if (e.getValue() > 1) {
        return e.getKey();
      }
    }
  }
}
