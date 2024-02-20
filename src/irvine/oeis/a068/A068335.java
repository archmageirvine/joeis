package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068335 Numbers k such that 3^tau(k) &lt;= k &lt; 2*3^tau(k).
 * @author Sean A. Irvine
 */
public class A068335 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long s0 = Jaguar.factor(++mN).sigma0AsLong();
      if (s0 < 39) {
        final long t = LongUtils.pow(3, s0);
        if (t <= mN && 2 * t > mN) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
