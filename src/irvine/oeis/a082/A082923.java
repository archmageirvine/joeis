package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082923 Sort the digits of these triangular numbers into descending order and drop zeros to get primes.
 * @author Sean A. Irvine
 */
public class A082923 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z tri = Functions.TRIANGULAR.z(++mN);
      Z t = Functions.DIGIT_SORT_DESCENDING.z(tri);
      while (true) {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        if (!qr[1].isZero()) {
          if (t.isProbablePrime()) {
            return tri;
          }
          break;
        }
        t = qr[0];
      }
    }
  }
}
