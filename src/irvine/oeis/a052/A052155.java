package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052155 Pseudoprimes to both base 2 and base 3, i.e., intersection of A001567 and A005935.
 * @author Sean A. Irvine
 */
public class A052155 implements Sequence {

  private long mN = 1103;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && LongUtils.modPow(2, mN - 1, mN) == 1 && LongUtils.modPow(3, mN - 1, mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
