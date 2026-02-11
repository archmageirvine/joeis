package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082922 Numbers k such that when the digits of Fibonacci(k) are sorted into decreasing order and zeros are dropped it is a prime.
 * @author Sean A. Irvine
 */
public class A082922 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      Z t = Functions.DIGIT_SORT_DESCENDING.z(Functions.FIBONACCI.z(++mN));
      while (true) {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        if (!qr[1].isZero()) {
          if (t.isProbablePrime()) {
            return Z.valueOf(mN);
          }
          break;
        }
        t = qr[0];
      }
    }
  }
}
