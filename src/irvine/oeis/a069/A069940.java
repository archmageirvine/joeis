package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069940 (1/2)*((Sum of digits of n)^2 + (Sum of digits^2 of n)).
 * @author Sean A. Irvine
 */
public class A069940 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z d1 = Functions.DIGIT_SUM.z(++mN);
    final Z d2 = Functions.DIGIT_SUM_SQUARES.z(mN);
    return d1.square().add(d2).divide2();
  }
}
