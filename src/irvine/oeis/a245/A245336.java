package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024649;

/**
 * A245336 Sum of digits of n written in fractional base 8/7.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245336 extends A024649 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()));
  }
}
