package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A004090 Sum of digits of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A004090 extends A000045 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}

