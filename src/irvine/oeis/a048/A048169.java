package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048169 n is divisible by the cube of the number of unitary divisors of n (A034444).
 * @author Sean A. Irvine
 */
public class A048169 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(Z.ONE.shiftLeft(3 * Jaguar.factor(mN).omega())).isZero()) {
        return mN;
      }
    }
  }
}

