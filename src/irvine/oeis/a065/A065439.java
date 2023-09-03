package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065439 Numbers n such that s[n], p[n] and s[n]+p[n] are all prime numbers, where s[n] is the sum of digits of n and p[n] is the product of digits of n.
 * @author Sean A. Irvine
 */
public class A065439 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  private final StringBuilder mS = new StringBuilder();
  private int mOnes = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mOnes;
      mS.append('1');
      if (mPrime.isPrime(mOnes + 2) && mPrime.isPrime(mOnes + 4)) {
        for (int k = 0; k <= mS.length(); ++k) {
          mA.add(new Z(mS.substring(0, k) + '2' + mS.substring(k)));
        }
      }
    }
    return mA.pollFirst();
  }
}
