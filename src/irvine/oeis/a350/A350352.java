package irvine.oeis.a350;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A350352 Products of three or more distinct prime numbers.
 * @author Sean A. Irvine
 */
public class A350352 extends Sequence1 {

  private long mN = 29;

  @Override
  public Z next() {
    while (true) {
      final long omega = Functions.OMEGA.l(++mN);
      if (omega >= 3 && Functions.BIG_OMEGA.l(mN) == omega) {
        return Z.valueOf(mN);
      }
    }
  }
}
