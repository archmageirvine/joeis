package irvine.oeis.a036;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036225.
 * @author Sean A. Irvine
 */
public class A036225 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeMap<Z, Long> mSeen = new TreeMap<>();
    Z m = mN;
    long cnt = 0;
    while (!mSeen.containsKey(m)) {
      mSeen.put(m, ++cnt);
      final StringBuilder sb = new StringBuilder();
      final int[] c = ZUtils.digitCounts(m);
      for (int d = 9; d >= 0; --d) {
        if (c[d] > 0) {
          sb.append(c[d]).append(d);
        }
      }
      m = new Z(sb);
    }
    return Z.valueOf(cnt - mSeen.get(m) + 1);
  }
}
