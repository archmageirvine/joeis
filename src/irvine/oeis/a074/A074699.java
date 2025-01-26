package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074699 a(n) = tau(Fibonacci(24*2^n))/(24*2^n) where tau(x) is the number of divisors of x (A000005(x)).
 * @author Sean A. Irvine
 */
public class A074699 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z t = Z.valueOf(24).shiftLeft(++mN);
    final Z s = Functions.SIGMA0.z(Functions.FIBONACCI.z(t));
    final Z[] qr = s.divideAndRemainder(t);
    if (!qr[1].isZero()) {
      throw new RuntimeException("Non-integer result: " + s + "/" + t);
    }
    return qr[0];
  }
}
