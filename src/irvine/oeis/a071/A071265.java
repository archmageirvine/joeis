package irvine.oeis.a071;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071261.
 * @author Sean A. Irvine
 */
public class A071265 extends Sequence1 {

  private final TreeMap<Long, Integer> mA = new TreeMap<>();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      while (mA.isEmpty() || mA.firstKey() > mN) {
        final long r = Functions.REVERSE.l(mN);
        if (r <= mN) {
          mA.merge(mN + r, 1, Integer::sum);
        }
        ++mN;
      }
      final Map.Entry<Long, Integer> e = mA.pollFirstEntry();
      if (e.getValue() == 2) {
        return Z.valueOf(e.getKey());
      }
    }
  }
}

