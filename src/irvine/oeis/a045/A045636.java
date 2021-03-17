package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045636 Numbers of the form p^2 + q^2, with p and q primes.
 * @author Sean A. Irvine
 */
public class A045636 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    if (mA.isEmpty() || mP.square().compareTo(mA.first()) <= 0) {
      Z q = Z.ONE;
      final Z p2 = mP.square();
      do {
        q = mPrime.nextPrime(q);
        mA.add(p2.add(q.square()));
      } while (!mP.equals(q));
      mP = mPrime.nextPrime(mP);
    }
    return mA.pollFirst();
  }
}
