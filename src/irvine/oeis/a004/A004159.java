package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004159 Sum of digits of n^2.
 * @author Sean A. Irvine
 */
public class A004159 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(Z.valueOf(++mN).square()));
  }
}
