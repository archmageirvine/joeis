package irvine.oeis.a169;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A169645 Primes p = prime(k) whose decimal expansion contains the string 13 and such that digsum(p) = disgum(k) where digsum = A007953 is the sum of digits function.
 * @author Sean A. Irvine
 */
public class A169645 extends A000040 {

  private long mN = 0;

  private boolean is13(Z p) {
    while (!p.isZero()) {
      if (p.mod(100) == 13) {
        return true;
      }
      p = p.divide(10);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (is13(p) && Functions.DIGIT_SUM.l(p) == Functions.DIGIT_SUM.l(mN)) {
        return p;
      }
    }
  }
}
