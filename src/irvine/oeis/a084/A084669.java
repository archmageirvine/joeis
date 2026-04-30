package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084669 Primes which are a concatenation of prime(n) and n.
 * @author Sean A. Irvine
 */
public class A084669 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z(super.next().toString() + ++mN);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
