package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070284 Smallest of 4 consecutive numbers each divisible by a square.
 * @author Sean A. Irvine
 */
public class A070284 extends Sequence1 {

  private long mN = 241;

  @Override
  public Z next() {
    while (true) {
      if (Functions.MOBIUS.i(++mN) == 0 && Functions.MOBIUS.i(mN + 1) == 0 && Functions.MOBIUS.i(mN + 2) == 0 && Functions.MOBIUS.i(mN + 3) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
