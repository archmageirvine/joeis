package irvine.oeis.a175;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A175753 Numbers with 46 divisors.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A175753 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private Z mPP = mP.pow(22);

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP.shiftLeft(22)) > 0) {
      mA.add(mP.pow(45));
      for (Z q = Z.TWO; q.compareTo(mP) < 0; q = mPrime.nextPrime(q)) {
        mA.add(mPP.multiply(q));
        mA.add(mP.multiply(q.pow(22)));
      }
      mP = mPrime.nextPrime(mP);
      mPP = mP.pow(22);
    }
    return mA.pollFirst();
  }
}
