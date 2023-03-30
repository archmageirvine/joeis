package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062403 Primes of the form 2*k*prime(k) + 1.
 * @author Sean A. Irvine
 */
public class A062403 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().multiply(++mN).multiply2().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
