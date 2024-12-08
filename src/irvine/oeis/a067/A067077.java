package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067077 Numbers whose product of distinct prime factors is equal to its sum of digits.
 * @author Sean A. Irvine
 */
public class A067077 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).squareFreeKernel().equals(Functions.DIGIT_SUM.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
