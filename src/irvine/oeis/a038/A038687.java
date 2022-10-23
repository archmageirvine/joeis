package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038687 Concatenate i &gt;= 1 and j &gt;= 1, then sort.
 * @author Sean A. Irvine
 */
public class A038687 extends Sequence1 {

  private Z mN = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final int[] c = ZUtils.digitCounts(mN);
      long d = 0;
      for (int k = 1; k < c.length; ++k) {
        d += c[k];
      }
      if (d > 1) {
        return mN;
      }
    }
  }
}
