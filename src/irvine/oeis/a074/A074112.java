package irvine.oeis.a074;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074112 Let omega(m) be the number of distinct prime divisors of m. Then a(n) is the largest n-digit squarefree number such that omega(n) &gt; omega(j) for all j &lt; n.
 * @author Sean A. Irvine
 */
public class A074112 extends Sequence1 {

  // After Charlie Neder

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private final List<Z> mPrimes = new ArrayList<>();
  private Z mP = Z.FIVE;
  {
    mPrimes.add(Z.TWO);
    mPrimes.add(Z.THREE);
  }

  @Override
  public Z next() {
    ++mN;
    final Z b = Z.TEN.pow(mN);
    int leng = 0;
    Z primorial = Z.ONE;
    long q = 2;
    while (primorial.multiply(q).compareTo(b) <= 0) {
      primorial = primorial.multiply(q);
      ++leng;
      q = mPrime.nextPrime(q);
    }
    final int upper = b.multiply(mPrimes.get(leng - 1)).divide(primorial).intValueExact();
    while (upper >= mPrimes.size()) {
      mPrimes.add(mP);
      mP = mPrime.nextPrime(mP);
    }
    TreeSet<Z> nums = new TreeSet<>();
    nums.add(Z.ONE);
    for (int k = 0; k < leng; ++k) {
      final TreeSet<Z> next = new TreeSet<>();
      for (final Z p : mPrimes) {
        for (final Z m : nums) {
          if (m.multiply(p.pow(leng - k)).compareTo(b) >= 0) {
            break;
          }
          if (m.mod(p).isZero()) {
            continue;
          }
          next.add(m.multiply(p));
        }
      }
      nums = next;
    }
    return nums.last();
  }
}
