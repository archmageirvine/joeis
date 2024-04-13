package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024633;

/**
 * A245343 Sum of digits of n written in fractional base 5/3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245343 extends A024633 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
