package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048166 Numbers k that are divisible by the number of unitary divisors of k (A034444).
 * @author Sean A. Irvine
 */
public class A048166 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Z.ONE.shiftLeft(Functions.OMEGA.i(mN))).isZero()) {
        return mN;
      }
    }
  }
}

