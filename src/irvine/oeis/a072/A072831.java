package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A003070.
 * @author Sean A. Irvine
 */
public class A072831 extends A000142 {

  @Override
  public Z next() {
    return Functions.DIGIT_LENGTH.z(2, super.next());
  }
}
