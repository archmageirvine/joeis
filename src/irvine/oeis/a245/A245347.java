package irvine.oeis.a245;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024645;

/**
 * A245347 Sum of digits of n written in fractional base 8/3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245347 extends A024645 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()));
  }
}
