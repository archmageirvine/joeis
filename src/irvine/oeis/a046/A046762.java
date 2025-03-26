package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046762 Numbers k such that the sum of the squares of the divisors of k is divisible by k.
 * @author Sean A. Irvine
 */
public class A046762 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA.z(2, mN).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
