package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A004157 Sum of digits of n-th triangular number.
 * @author Sean A. Irvine
 */
public class A004157 extends A000217 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()));
  }
}
