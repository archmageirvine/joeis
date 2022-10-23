package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046764 Sum of the 4th powers of the divisors of n is divisible by n.
 * @author Sean A. Irvine
 */
public class A046764 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).sigma(4).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
