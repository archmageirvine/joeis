package irvine.oeis.a081;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A081264 Odd Fibonacci pseudoprimes: odd composite numbers k such that either (1) k divides Fibonacci(k-1) if k == +-1 (mod 5) or (2) k divides Fibonacci(k+1) if k == +-2 (mod 5).
 * @author Sean A. Irvine
 */
public class A081264 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final long r = c.mod(5);
      if (r == 1 || r == 4) {
        if (Fibonacci.fibonacci(c.subtract(1), c).isZero()) {
          return c;
        }
      } else if (r == 2 || r == 3) {
        if (Fibonacci.fibonacci(c.add(1), c).isZero()) {
          return c;
        }
      }
    }
  }
}

