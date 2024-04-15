package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056757 Cube of number of divisors is larger than the number.
 * @author Sean A. Irvine
 */
public class A056757 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA0.z(mN).pow(3).compareTo(mN) > 0) {
        return mN;
      }
    }
  }
}
