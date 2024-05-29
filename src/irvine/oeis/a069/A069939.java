package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069939 1/3!*((Sum of digits of n)^3 + 3*(Sum of digits of n)*(Sum of digits^2 of n) + 2*(Sum of digits^3 of n)).
 * @author Sean A. Irvine
 */
public class A069939 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z d1 = Functions.DIGIT_SUM.z(++mN);
    final Z d2 = Functions.DIGIT_SUM_SQUARES.z(mN);
    final Z d3 = Functions.DIGIT_SUM_CUBES.z(mN);
    return d1.pow(3).add(d1.multiply(d2).multiply(3)).add(d3.multiply2()).divide(6);
  }
}
