package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A034375 Fibonacci numbers with all odd digits (probably finite).
 * @author Sean A. Irvine
 */
public class A034375 extends A000045 {

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if ((Functions.SYNDROME.i(f) & 0b101010101) == 0) {
        return f;
      }
    }
  }
}

