package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A060064 First subsequent, disjoint occurrence of n consecutive nonprimes.
 * @author Sean A. Irvine
 */
public class A060064 extends AbstractSequence {

  /* Construct the sequence. */
  public A060064() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 2;

  @Override
  public Z next() {
    ++mN;
    long p = mPrime.nextPrime(mM);
    while (true) {
      final long q = mPrime.nextPrime(p);
      if (q - p > mN) {
        mM = p + 1;
        return Z.valueOf(mM);
      }
      p = q;
    }
  }
}
