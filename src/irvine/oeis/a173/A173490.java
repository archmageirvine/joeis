package irvine.oeis.a173;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A173490 Even abundant numbers (even numbers n whose sum of divisors exceeds 2n).
 * @author Sean A. Irvine
 */
public class A173490 extends Sequence1 {

  private Z mN = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (Functions.SIGMA1.z(mN).compareTo(mN.multiply2()) > 0) {
        return mN;
      }
    }
  }
}
