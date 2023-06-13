package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064113 Indices of primes prime(i) such that (1/3)*(prime(i)+prime(i+1)+prime(i+2)) is a prime.
 * @author Sean A. Irvine
 */
public class A064113 extends A000040 {

  private long mN = 0;
  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = mA;
      mA = mB;
      mB = super.next();
      final Z[] qr = p.add(mA).add(mB).divideAndRemainder(Z.THREE);
      if (qr[1].isZero() && qr[0].isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
