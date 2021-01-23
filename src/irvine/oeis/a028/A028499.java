package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028499 6-hyperperfect numbers: n = 6*(sigma(n) - n - 1) + 1.
 * @author Sean A. Irvine
 */
public class A028499 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long sigma = Cheetah.factor(++mN).sigma().longValueExact();
      final long s = sigma - mN - 1;
      if (6 * s == mN - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
