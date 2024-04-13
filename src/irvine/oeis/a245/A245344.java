package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024640;

/**
 * A245344 Sum of digits of n written in fractional base 7/3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245344 extends A024640 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()));
  }
}
