package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A007605 Sum of digits of n-th prime.
 * @author Sean A. Irvine
 */
public class A007605 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()));
  }
}
