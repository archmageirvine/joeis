package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A074464 Average digit (rounded down) in the decimal expansion of a prime number p, where 2^p-1 is a Mersenne prime.
 * @author Sean A. Irvine
 */
public class A074464 extends A000043 {

  @Override
  public Z next() {
    final Z p = super.next();
    final long s = Functions.DIGIT_SUM.l(p);
    final long l = Functions.DIGIT_LENGTH.l(p);
    return Z.valueOf(s / l);
  }
}

