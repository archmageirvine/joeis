package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048168 n is divisible by the square of the number of unitary divisors of n (A034444).
 * @author Sean A. Irvine
 */
public class A048168 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Z.ONE.shiftLeft(2L * Functions.OMEGA.i(mN))).isZero()) {
        return mN;
      }
    }
  }
}

