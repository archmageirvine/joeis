package irvine.oeis.a058;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058500 Primes of the form p*2^k + 1, where p is an odd prime and k &gt; 0.
 * @author Sean A. Irvine
 */
public class A058500 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.SIX); // 3 * 2, avoid need for isEmpty() check
  }
  private Z mP = Z.FIVE;
  private Z mP2 = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      if (mA.first().compareTo(mP2) > 0) {
        mA.add(mP2);
        mP = mPrime.nextPrime(mP);
        mP2 = mP.multiply2();
      }
      final Z t = mA.pollFirst();
      mA.add(t.multiply2());
      final Z u = t.add(1);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}
