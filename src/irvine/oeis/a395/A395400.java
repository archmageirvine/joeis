package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A395400 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A395400 extends Sequence3 {

  private final Fast mPrimes = new Fast();
  private long mP = 3;

  @Override
  public Z next() {
    mP = mPrimes.nextPrime(mP);
    Z p = Z.ONE;
    Z lim = Z.TEN;
    while (true) {
      p = mPrimes.nextPrime(p);
      if (p.compareTo(lim) >= 0) {
        lim = lim.multiply(10);
      }
      Z r = p;
      Z q = mPrimes.nextPrime(r);
      if (q.compareTo(lim) < 0) {
        long sum = 0;
        while (!q.isZero()) {
          final Z[] f = r.divideAndRemainder(Z.TEN);
          final Z[] g = q.divideAndRemainder(Z.TEN);
          sum += g[1].longValue() * f[1].longValue();
          r = f[0];
          q = g[0];
        }
        if (mP == sum) {
          return p;
        }
      }
    }
  }
}

