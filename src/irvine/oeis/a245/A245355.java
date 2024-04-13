package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024647;

/**
 * A245355 Sum of digits of n written in fractional base 8/5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245355 extends A024647 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
