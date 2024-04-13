package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A004097 Sum of digits of Bell numbers.
 * @author Sean A. Irvine
 */
public class A004097 extends A000110 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}

