package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085306 Prime numbers such that first reversing digits and after squaring equals the result of first-squaring and after-reversing. Primes in A085305.
 * @author Sean A. Irvine
 */
public class A085306 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Functions.REVERSE.z(p).square().equals(Functions.REVERSE.z(p.square()))) {
        return p;
      }
    }
  }
}
