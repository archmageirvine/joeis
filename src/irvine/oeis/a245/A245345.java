package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024650;

/**
 * A245345 Sum of digits of n written in fractional base 9/2.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245345 extends A024650 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
