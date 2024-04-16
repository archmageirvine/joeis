package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068406 Numbers n such that n and 2n+1 have the same number of prime divisors.
 * @author Sean A. Irvine
 */
public class A068406 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(++mN) == Functions.OMEGA.i(2 * mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}

