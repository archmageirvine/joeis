package irvine.oeis.a056;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056796 Minimal number of steps to get from 0 to n when there are 3 kinds of step: add 1, multiply by 2, multiply by 3.
 * @author Sean A. Irvine
 */
public class A056796 extends Sequence0 {

  private final TreeMap<Long, Integer> mA = new TreeMap<>();
  {
    mA.put(0L, 0);
  }

  private void update(final long n, final int cnt) {
    mA.merge(n, cnt + 1, (k, v) -> Math.min(v, k));
  }

  @Override
  public Z next() {
    final Map.Entry<Long, Integer> e = mA.pollFirstEntry();
    final long n = e.getKey();
    final int cnt = e.getValue();
    update(n + 1, cnt);
    if (n != 0) {
      update(2 * n, cnt);
      update(3 * n, cnt);
    }
    return Z.valueOf(cnt);
  }
}
