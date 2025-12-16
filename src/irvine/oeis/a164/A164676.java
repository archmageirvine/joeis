package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A164676 Primes obtained from other primes by taking the corresponding powers of each digit and adding the result.
 * @author Sean A. Irvine
 */
public class A164676 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      Z p = super.next();
      Z sum = Z.ZERO;
      while (!p.isZero()) {
        final Z[] qr = p.divideAndRemainder(10);
        sum = sum.add(qr[1].pow(qr[1]));
        p = qr[0];
      }
      if (sum.isProbablePrime()) {
        return sum;
      }
    }
  }
}
