package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028500 12-hyperperfect numbers: n = 12*(sigma(n) - n - 1) + 1.
 * @author Sean A. Irvine
 */
public class A028500 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long sigma = Jaguar.factor(++mN).sigma().longValueExact();
      final long s = sigma - mN - 1;
      if (12 * s == mN - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
