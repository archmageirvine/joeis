package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024638;

/**
 * A245321 Sum of digits of n written in fractional base 6/5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245321 extends A024638 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()));
  }
}
