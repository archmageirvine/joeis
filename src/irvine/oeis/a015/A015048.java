package irvine.oeis.a015;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A015048 Numbers n such that there are no primes between <code>S(n)</code> and <code>S(n+1)</code> inclusive where S is the Kempner function <code>A002034</code>.
 * @author Sean A. Irvine
 */
public class A015048 extends A002034 {

  private final Fast mPrime = new Fast();
  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mPrime.nextPrime(t.min(mA).subtract(1)).compareTo(t.max(mA)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
