package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075741 Smallest a(n)&gt;2 such that all integers strictly between a(n)-n and a(n) are composite.
 * @author Sean A. Irvine
 */
public class A075741 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 3;

  @Override
  public Z next() {
    ++mN;
    while (mPrime.nextPrime(mM - mN) < mM) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
