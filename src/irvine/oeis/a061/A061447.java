package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061447 Primitive part of Lucas(n).
 * @author Sean A. Irvine
 */
public class A061447 extends Sequence1 {

  private int mN = 0;

  protected Z lucasStar(final int n) {
    Z num = Z.ONE;
    Z den = Z.ONE;
    for (final Z dd : Jaguar.factor(2L * n).divisors()) {
      final int d = dd.intValueExact();
      final int m = Functions.MOBIUS.i((long) d);
      if (m == 1) {
        num = num.multiply(Fibonacci.fibonacci(2L * n / d));
      } else if (m == -1) {
        den = den.multiply(Fibonacci.fibonacci(2L * n / d));
      }
    }
    return num.divide(den);
  }

  @Override
  public Z next() {
    return lucasStar(++mN);
  }
}
