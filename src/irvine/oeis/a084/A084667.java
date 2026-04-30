package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084667 Primes which are a concatenation of n and prime(n).
 * @author Sean A. Irvine
 */
public class A084667 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z(++mN + super.next().toString());
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
