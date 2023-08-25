package irvine.oeis.a355;
// manually robots/union2 at 2023-08-23 09:55

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A355430 Primes starting with an even decimal digit.
 * @author Georg Fischer
 */
public class A355430 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if ((p.toString().charAt(0) & 1) == 0) {
        return p;
      }
    }
  }
}

