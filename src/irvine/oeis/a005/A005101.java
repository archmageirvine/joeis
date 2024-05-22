package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005101 Abundant numbers (sum of divisors of m exceeds 2m).
 * @author Sean A. Irvine
 */
public class A005101 extends Sequence1 {

  private Z mN = Z.valueOf(11);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA1.z(mN).compareTo(mN.multiply2()) > 0) {
        return mN;
      }
    }
  }
}
