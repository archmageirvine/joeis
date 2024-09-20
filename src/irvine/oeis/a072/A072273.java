package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a060.A060594;

/**
 * A072248.
 * @author Sean A. Irvine
 */
public class A072273 extends A060594 {

  @Override
  public Z next() {
    return Functions.DIGIT_LENGTH.z(2, super.next()).subtract(1);
  }
}
