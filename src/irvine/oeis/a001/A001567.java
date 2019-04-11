package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001567 Fermat pseudoprimes to base <code>2,</code> also called Sarrus numbers or Poulet numbers.
 * @author Sean A. Irvine
 */
public class A001567 implements Sequence {

  private long mN = 339;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && LongUtils.modPow(2, mN - 1, mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
