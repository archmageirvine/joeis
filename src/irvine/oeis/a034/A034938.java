package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a007.A007528;

/**
 * A034938 Primes p such that (p-3)/2 is a prime of the form 6k-1.
 * @author Sean A. Irvine
 */
public class A034938 extends A007528 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.multiply2().add(3);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
