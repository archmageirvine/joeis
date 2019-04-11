package irvine.oeis.a162;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A162529 Numbers k whose largest divisor <code>&lt;= sqrt(k)</code> equals 9.
 * @author Sean A. Irvine
 */
public class A162529 implements Sequence {

  private long mN = 72;

  @Override
  public Z next() {
    while (true) {
      mN += 9;
      final Z[] d = Cheetah.factor(mN).divisorsSorted();
      final long s = LongUtils.sqrt(mN);
      for (int k = d.length - 1; k >= 0; --k) {
        final long w = d[k].longValue();
        if (w <= s) {
          if (w == 9) {
            return Z.valueOf(mN);
          }
          break;
        }
      }
    }
  }
}
