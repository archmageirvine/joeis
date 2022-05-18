package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048170 n is divisible by the 4th power of the number of unitary divisors of n (A034444).
 * @author Sean A. Irvine
 */
public class A048170 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Z.ONE.shiftLeft(4 * Jaguar.factor(mN).omega())).isZero()) {
        return mN;
      }
    }
  }
}

