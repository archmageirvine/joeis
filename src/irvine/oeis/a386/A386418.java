package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A386418 a(n) is the number of nondegenerate triangles whose sides are distinct divisors of A386417(n).
 * @author Sean A. Irvine
 */
public class A386418 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final long[] d = ZUtils.toLong(Jaguar.factor(++mN).divisorsSorted());
      long cnt = 0;
      for (int k = 0; k < d.length; ++k) {
        for (int j = k + 1; j < d.length; ++j) {
          for (int i = j + 1; i < d.length; ++i) {
            if (d[j] + d[k] > d[i]) {
              ++cnt;
            }
          }
        }
      }
      if (cnt > 0) {
        return Z.valueOf(cnt);
      }
    }
  }
}
