package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020901 Greatest k such that k-th prime <code>&lt; 3</code> times n-th prime.
 * @author Sean A. Irvine
 */
public class A020901 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mM = 0;
  private Z mP = Z.ONE;
  private Z mQ = Z.ONE;

  protected long scale() {
    return 3;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z t = mP.multiply(scale());
    while (mQ.compareTo(t) < 0) {
      ++mM;
      mQ = mPrime.nextPrime(mQ);
    }
    return Z.valueOf(mM - 1);
  }
}
