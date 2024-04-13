package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024664;

/**
 * A245339 Sum of digits of n written in fractional base 10/9.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245339 extends A024664 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
