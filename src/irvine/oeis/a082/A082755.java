package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a019.A019546;

/**
 * A082755 Smaller of a pair of consecutive primes having only prime digits.
 * @author Sean A. Irvine
 */
public class A082755 extends A019546 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (Functions.PREV_PRIME.z(mA).equals(t)) {
        return t;
      }
    }
  }
}
