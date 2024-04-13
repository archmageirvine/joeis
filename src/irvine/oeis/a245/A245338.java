package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024656;

/**
 * A245338 Sum of digits of n written in fractional base 9/8.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245338 extends A024656 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
