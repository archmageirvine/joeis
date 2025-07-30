package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079063 Least k such that sqrt(prime(n+k))-sqrt(prime(n))&gt;1.
 * @author Sean A. Irvine
 */
public class A079063 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final CR sp = CR.valueOf(p).sqrt();
    long k = 0;
    Z q = p;
    while (true) {
      ++k;
      q = mPrime.nextPrime(q);
      if (CR.valueOf(q).sqrt().subtract(sp).compareTo(CR.ONE) > 0) {
        return Z.valueOf(k);
      }
    }
  }
}

