package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A067102.
 * @author Sean A. Irvine
 */
public class A067131 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long[] d = ZUtils.toLong(Jaguar.factor(++mN).divisorsSorted());
    int m = 1;
    for (int i = 0; i < d.length - 1; ++i) {
      final long di = d[i];
      for (int j = i + 1; j < d.length; ++j) {
        int c = 1;
        long k = d[j];
        final long s = k - di;
        while (mN % k == 0) {
          k += s;
          ++c;
        }
        if (c > m) {
          m = c;
        }
      }
    }
    return Z.valueOf(m);
  }
}
