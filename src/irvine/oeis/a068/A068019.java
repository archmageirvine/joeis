package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068019 Composite n such that both 1 + phi(n) and -1 + phi(n) are primes, i.e., phi(n) is the middle term between twin primes (A014574).
 * @author Sean A. Irvine
 */
public class A068019 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z t = Functions.PHI.z(c);
      if (t.subtract(1).isProbablePrime() && t.add(1).isProbablePrime()) {
        return c;
      }
    }
  }
}
