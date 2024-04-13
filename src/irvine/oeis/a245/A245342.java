package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024639;

/**
 * A245342 Sum of digits of n written in fractional base 7/2.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245342 extends A024639 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()));
  }
}
