package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024642;

/**
 * A245352 Sum of digits of n written in fractional base 7/5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245352 extends A024642 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
