package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075540 Integers that are the average of three successive primes.
 * @author Sean A. Irvine
 */
public class A075540 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mA;
      mA = mB;
      mB = super.next();
      final Z[] qr = mB.add(mA).add(p).divideAndRemainder(3);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

