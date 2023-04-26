package irvine.oeis.a063;

import java.util.HashMap;
import java.util.Map;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063454 Number of solutions to x^3 + y^3 = z^3 mod n.
 * @author Sean A. Irvine
 */
public class A063454 extends Sequence1 {

  // After Chai Wah Wu

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashMap<Long, Long> cnts = new HashMap<>();
    for (long i = 0; i < mN; ++i) {
      final long m = LongUtils.modPow(i, 3, mN);
      cnts.merge(m, 1L, Long::sum);
    }
    long cnt = 0;
    for (final Map.Entry<Long, Long> i : cnts.entrySet()) {
      for (final Map.Entry<Long, Long> j : cnts.entrySet()) {
        final long k = (i.getKey() + j.getKey()) % mN;
        final Long v = cnts.get(k);
        if (v != null) {
          cnt += i.getValue() * j.getValue() * v;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
