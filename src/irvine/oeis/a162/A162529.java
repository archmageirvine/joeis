package irvine.oeis.a162;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A162529 Numbers k whose largest divisor &lt;= sqrt(k) equals 9.
 * @author Sean A. Irvine
 */
public class A162529 extends Sequence1 {

  private long mN = 72;

  @Override
  public Z next() {
    while (true) {
      mN += 9;
      final Z[] d = Jaguar.factor(mN).divisorsSorted();
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
