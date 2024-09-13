package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072225 Numbers n such that prime(n) + prime(n+1) + prime(n+2) is prime.
 * @author Sean A. Irvine
 */
public class A072225 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (mPrime.isPrime(p.add(q).add(mPrime.nextPrime(q)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
