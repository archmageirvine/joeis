package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073703 Smallest prime p such that also p+prime(n)*2 is a prime.
 * @author Sean A. Irvine
 */
public class A073703 extends A000040 {

  @Override
  public Z next() {
    final Z p2 = super.next().multiply2();
    long q = 2; // answer must be odd
    while (true) {
      q = mPrime.nextPrime(q);
      if (p2.add(q).isProbablePrime()) {
        return Z.valueOf(q);
      }
    }
  }
}
