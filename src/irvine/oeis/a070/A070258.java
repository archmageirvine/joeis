package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070258 Smallest of 3 consecutive numbers each divisible by a square.
 * @author Sean A. Irvine
 */
public class A070258 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Functions.MOBIUS.i(++mN) == 0 && Functions.MOBIUS.i(mN + 1) == 0 && Functions.MOBIUS.i(mN + 2) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
