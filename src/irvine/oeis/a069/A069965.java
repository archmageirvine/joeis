package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A069965 (Sum of digits of n)^5 - (sum of digits^5 of n).
 * @author Sean A. Irvine
 */
public class A069965 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(++mN).pow(5).subtract(ZUtils.digitSumPower(mN, 10, 5));
  }
}
