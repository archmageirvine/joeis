package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001567;

/**
 * A086000 For p = prime(n), a(n) is the smallest N such that pN is a base-2 pseudoprime (that is, 2^(pN-1) = 1 mod pN).
 * @author Sean A. Irvine
 */
public class A086000 extends Sequence2 {

  private final DirectSequence mA = DirectSequence.create(new A001567());
  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long k = 0;
    while (true) {
      if (mA.a(++k).mod(mP) == 0) {
        return mA.a(k).divide(mP);
      }
    }
  }
}
