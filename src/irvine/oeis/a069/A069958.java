package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069958 (Sum of digits of n)^3 - (sum of digits^3 of n).
 * @author Sean A. Irvine
 */
public class A069958 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(++mN).pow(3).subtract(Functions.DIGIT_SUM_CUBES.z(mN));
  }
}
