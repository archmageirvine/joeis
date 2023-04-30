package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063461 Primes of the form k^2 + prime(k) + 1.
 * @author Sean A. Irvine
 */
public class A063461 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(++mN * mN).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
