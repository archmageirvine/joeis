package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068781 Lesser of two consecutive numbers each divisible by a square.
 * @author Sean A. Irvine
 */
public class A068781 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Functions.MOBIUS.i(++mN) == 0 && Functions.MOBIUS.i(mN + 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
