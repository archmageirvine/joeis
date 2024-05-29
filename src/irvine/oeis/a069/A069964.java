package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A069964 a(n) = (sum of digits of n)^4 - (sum of digits^4 of n).
 * @author Sean A. Irvine
 */
public class A069964 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(++mN).pow(4).subtract(ZUtils.digitSumPower(mN, 10, 4));
  }
}
