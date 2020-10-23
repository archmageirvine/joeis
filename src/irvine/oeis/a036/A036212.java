package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036212.
 * @author Sean A. Irvine
 */
public class A036212 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeSet<Z> mSeen = new TreeSet<>();
    Z m = mN;
    long cnt = 0;
    while (mSeen.add(m)) {
      final StringBuilder sb = new StringBuilder();
      final int[] c = ZUtils.digitCounts(m);
      for (int d = 9; d >= 0; --d) {
        if (c[d] > 0) {
          sb.append(c[d]).append(d);
        }
      }
      m = new Z(sb);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
