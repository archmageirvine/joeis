package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A067898 Least digit not used in n (or 10 if n is pandigital).
 * @author Georg Fischer
 */
public class A067898 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final int[] dc = ZUtils.digitCounts(++mN);
    int i = -1;
    while (++i < 10) {
      if (dc[i] == 0) {
        return Z.valueOf(i);
      }
    }
    return Z.TEN;
  }
}
