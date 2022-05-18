package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046762 Numbers k such that the sum of the squares of the divisors of k is divisible by k.
 * @author Sean A. Irvine
 */
public class A046762 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).sigma2().mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
