package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057664 Primes of the form p + 2^p where p is prime.
 * @author Sean A. Irvine
 */
public class A057664 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z a = p.add(Z.ONE.shiftLeft(p.longValueExact()));
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
