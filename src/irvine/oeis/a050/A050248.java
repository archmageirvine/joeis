package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a007.A007504;

/**
 * A050248 Integer averages of first k primes for some k.
 * @author Sean A. Irvine
 */
public class A050248 extends A007504 {

  private long mN = 0;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      final Z[] qr = s.divideAndRemainder(Z.valueOf(++mN));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
