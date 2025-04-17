package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076815 Initial indices of five successive primes squared with integer average.
 * @author Sean A. Irvine
 */
public class A076815 extends A000040 {

  private long mK = 0;

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z s = mPrime.nextPrime(r);
      final Z t = mPrime.nextPrime(s);
      final Z c = p.square().add(q.square()).add(r.square()).add(s.square()).add(t.square());
      if (c.mod(5) == 0) {
        return Z.valueOf(mK);
      }
    }
  }
}

