package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A083240 Primes prime(j) such that prime(j)-j is a true power of prime.
 * @author Sean A. Irvine
 */
public class A083240 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.subtract(++mN);
      if (!t.isProbablePrime() && Functions.OMEGA.i(t) == 1) {
        return p;
      }
    }
  }
}

