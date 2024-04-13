package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A004095 Sum of digits of Catalan numbers.
 * @author Sean A. Irvine
 */
public class A004095 extends A000108 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(super.next()));
  }
}

