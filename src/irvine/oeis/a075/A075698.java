package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075698 Primes of index m from A075696, a(n) = prime(A075696(n)).
 * @author Sean A. Irvine
 */
public class A075698 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long s = Functions.DIGIT_SUM.l(++mN);
      if (p.toString().contains(String.valueOf(s))) {
        return p;
      }
    }
  }
}
