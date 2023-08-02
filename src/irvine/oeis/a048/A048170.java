package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048170 n is divisible by the 4th power of the number of unitary divisors of n (A034444).
 * @author Sean A. Irvine
 */
public class A048170 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Z.ONE.shiftLeft(4L * Jaguar.factor(mN).omega())).isZero()) {
        return mN;
      }
    }
  }
}

