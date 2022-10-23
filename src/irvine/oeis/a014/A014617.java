package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014617 Antidiagonals of the prime-composite array B(m,n) (see A067681) that are zeros from the first Borve conjecture.
 * @author Sean A. Irvine
 */
public class A014617 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mC = 3;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mPrime.isPrime(++mC)) {
        ++mC;
      }
      long c = mC;
      long p = 2;
      boolean ok = true;
      while (c >= 4) {
        if (c % p == 0) {
          ok = false;
          break;
        }
        p = mPrime.nextPrime(p);
        if (mPrime.isPrime(--c)) {
          --c;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
