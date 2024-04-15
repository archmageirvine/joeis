package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007593 2-hyperperfect numbers: n = 2*(sigma(n) - n - 1) + 1.
 * @author Sean A. Irvine
 */
public class A007593 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long sigma = Functions.SIGMA.z(++mN).longValueExact();
      final long s = sigma - mN - 1;
      if (2 * s == mN - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
