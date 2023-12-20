package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067548 Least k &gt; n such that gcd(prime(n)+k, n+prime(k)) &gt; 1.
 * @author Sean A. Irvine
 */
public class A067548 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    final Z p = super.next();
    Z q = p;
    while (true) {
      ++k;
      q = mPrime.nextPrime(q);
      if (p.add(k).gcd(q.add(mN)).compareTo(Z.ONE) > 0) {
        return Z.valueOf(k);
      }
    }
  }
}
