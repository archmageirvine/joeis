package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074461 Average digit (rounded down) in the decimal expansion of the n-th prime number.
 * @author Sean A. Irvine
 */
public class A074461 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final long s = Functions.DIGIT_SUM.l(p);
    final long l = Functions.DIGIT_LENGTH.l(p);
    return Z.valueOf(s / l);
  }
}

