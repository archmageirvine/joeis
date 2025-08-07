package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A386417 Numbers k for which there exists at least one nondegenerate triangle with sides that are distinct divisors of k.
 * @author Sean A. Irvine
 */
public class A386417 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final long[] d = ZUtils.toLong(Jaguar.factor(++mN).divisorsSorted());
      for (int k = 0; k < d.length; ++k) {
        for (int j = k + 1; j < d.length; ++j) {
          for (int i = j + 1; i < d.length; ++i) {
            if (d[j] + d[k] > d[i]) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
