package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A390917 Numbers k such that prime(k) * prime(k+1) * prime(k+2) * prime(k+3) - (prime(k) + prime(k+1) + prime(k+2) + prime(k+3)) is prime.
 * @author Sean A. Irvine
 */
public class A390917 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z s = mPrime.nextPrime(r);
      final Z t = p.multiply(q).multiply(r).multiply(s).subtract(p.add(q).add(r).add(s));
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
