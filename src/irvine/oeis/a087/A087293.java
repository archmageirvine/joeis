package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A087293 Numbers k such that ((prime(k)*prime(k+1))^2 + 1)/2 is prime.
 * @author Sean A. Irvine
 */
public class A087293 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (mPrime.nextPrime(p).multiply(p).square().add(1).divide2().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

