package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067077 Product of the prime factors of n equals the sum of the digits of n.
 * @author Sean A. Irvine
 */
public class A067077 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).squareFreeKernel().equals(Z.valueOf(Functions.DIGIT_SUM.l(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
