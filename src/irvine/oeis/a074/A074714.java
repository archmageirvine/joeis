package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074714 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long v = Functions.VALUATION.l(p.square().subtract(1), 2);
      if (Fibonacci.fibonacci(Z.ONE.shiftLeft(v - 1), p).isZero()) {
        return p;
      }
    }
  }
}
