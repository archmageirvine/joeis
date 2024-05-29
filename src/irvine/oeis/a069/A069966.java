package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A069966 (Sum of digits of n)^6 - (sum of digits^6 of n).
 * @author Sean A. Irvine
 */
public class A069966 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(++mN).pow(6).subtract(ZUtils.digitSumPower(mN, 10, 6));
  }
}
