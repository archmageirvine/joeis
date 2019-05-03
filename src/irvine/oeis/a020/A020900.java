package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020900.
 * @author Sean A. Irvine
 */
public class A020900 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mM = 0;
  private Z mP = Z.ONE;
  private Z mQ = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z t = mP.multiply2();
    while (mQ.compareTo(t) < 0) {
      ++mM;
      mQ = mPrime.nextPrime(mQ);
    }
    return Z.valueOf(mM - 1);
  }
}
