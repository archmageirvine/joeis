package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082663 Odd semiprimes p*q with p &lt; q &lt; 2*p.
 * @author Sean A. Irvine
 */
public class A082663 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  private long mP = 3;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.valueOf(mP).square().divide2()) > 0) {
      long q = mP;
      mP = mPrime.nextPrime(mP);
      while (2 * q > mP) {
        mA.add(Z.valueOf(mP).multiply(q));
        q = mPrime.prevPrime(q);
      }
    }
    return mA.pollFirst();
  }
}
