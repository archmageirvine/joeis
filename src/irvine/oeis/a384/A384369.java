package irvine.oeis.a384;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384369 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A384369 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long omega = Functions.BIG_OMEGA.l(++mN);
      if (LongUtils.modPow(omega, omega, mN) == omega) {
        return Z.valueOf(mN);
      }
    }
  }
}
